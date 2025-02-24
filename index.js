const form = document.querySelector('form');
const input = document.querySelector('input');
const ul = document.querySelector('ul');
const searchInput = document.querySelector('.input');
const searchButton = document.querySelector('.button');
let todos = [];

const save = () => {
    localStorage.setItem('todos',JSON.stringify(todos));
}

const UpdateItem= (event) => {
    const userInput = prompt("수정할 내용: ");
    if (userInput === null || userInput.trim() === "") return;

    const priority = parseInt(prompt("우선순위를 입력하세요 (숫자입력): "));
    if(isNaN(priority)) return;
    
    const target = event.target.parentElement;
    const span = target.querySelector('span'); 
    
    todos = todos.map((todo) =>
    {
        if(todo.id == parseInt(target.id))
        {
            todo.text = userInput;
            todo.priority = priority;
            return todo;
        }
        else
        {
            return todo;
        }
    });
    span.innerText = userInput;
    sortTodos();
    renderTodos(); 
    save();
};

const delItem = (event) => {
    const target = event.target.parentElement;
    
    todos = todos.filter((todo) => todo.id !== parseInt(target.id));
    save();

    target.remove(); 
}

const addItem = (todo) => {
    if(todo.text !== '')
    {
        const li = document.createElement('li');
        const span = document.createElement('span');
        const button1 = document.createElement('button'); 
        const button2 = document.createElement('button'); 
        
        span.innerText = `${todo.priority} 순위: ${todo.text}`;
        button1.innerText = '수정';
        button2.innerText = '삭제';
        button1.addEventListener('click',UpdateItem);
        button2.addEventListener('click',delItem);
        
        li.appendChild(span);
        li.appendChild(button1);
        li.appendChild(button2);
        ul.appendChild(li);
        li.id = todo.id;
    }
} 

const renderTodos = () => {
    ul.innerHTML = '';
    todos.forEach(addItem);
}

const sortTodos = () => {
    todos.sort((a,b) => a.priority - b.priority);
}

const handler = (event) => {
    event.preventDefault();

    const priority = parseInt(prompt("우선순위를 입력하세요 (숫자입력): "));
    if(isNaN(priority)) return;

        const todo = {
            id : Date.now(),
            text: input.value,
            priority : priority,
        }; 

    todos.push(todo);
    sortTodos();
    renderTodos(); 
    save();
    input.value='';
}

const init = () => {
    const userTodos = JSON.parse(localStorage.getItem('todos'));
    if(userTodos)
    {
        userTodos.forEach((todo) => {
            addItem(todo);
        });
        sortTodos();
        todos = userTodos;
    }
}

const show = (event) => {
    event.preventDefault();
    const searchValue = searchInput.value.trim().toLowerCase();
    if (searchValue === "") 
    {
        sortTodos();
        renderTodos(); 
        return;
    }

    const filteredTodos = todos.filter((todo) =>
        todo.text.toLowerCase().includes(searchValue)
    );
    ul.innerHTML = '';
    filteredTodos.sort((a,b) => a.priority - b.priority);
    filteredTodos.forEach(addItem); 
}

form.addEventListener('submit',handler);
searchButton.addEventListener('click',show);
init();