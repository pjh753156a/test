코드 기능 정리
이 코드의 주요 기능은 **할 일 목록(To-Do List)**을 관리하는 웹 애플리케이션을 구현하는 것이다.
사용자는 할 일을 추가, 수정, 삭제할 수 있으며, 우선순위를 부여하고 검색을 통해 특정 항목을 찾을 수도 있다.
로컬 스토리지를 사용하여 데이터를 저장하고, 페이지를 새로고침해도 할 일 목록이 유지된다.

1. 기본 변수 및 요소 선택
const form = document.querySelector('form');
const input = document.querySelector('input');
const ul = document.querySelector('ul');
const searchInput = document.querySelector('.input');
const searchButton = document.querySelector('.button');
let todos = [];

form: 할 일 입력 폼을 선택
input: 사용자가 할 일을 입력하는 필드 선택
ul: 할 일 목록을 표시할 ul 요소 선택
searchInput: 검색 입력 필드 선택
searchButton: 검색 버튼 선택
todos: 할 일 목록을 저장하는 배열 (초기값 [])


2. 할 일 목록을 로컬 스토리지에 저장
const save = () => {
    localStorage.setItem('todos', JSON.stringify(todos));
}
todos 배열을 localStorage에 JSON 형식으로 저장하여 페이지를 새로고침해도 데이터가 유지되도록 함.


3. 할 일 수정 기능
const UpdateItem = (event) => {
    const userInput = prompt("수정할 내용: ");
    if (userInput === null || userInput.trim() === "") return;

    const priority = parseInt(prompt("우선순위를 입력하세요 (숫자입력): "));
    if (isNaN(priority)) return;

    const target = event.target.parentElement;
    const span = target.querySelector('span'); 
    
    todos = todos.map((todo) => {
        if (todo.id == parseInt(target.id)) {
            todo.text = userInput;
            todo.priority = priority;
            return todo;
        }
        return todo;
    });

    span.innerText = `${priority} 순위: ${userInput}`;
    sortTodos();
    renderTodos();
    save();
};

사용자가 "수정" 버튼을 클릭하면 prompt를 통해 새 할 일과 우선순위를 입력받음.
todos 배열에서 해당 id를 가진 항목을 찾아 수정.
수정된 내용을 반영하여 다시 렌더링 후 저장.


4. 할 일 삭제 기능
const delItem = (event) => {
    const target = event.target.parentElement;
    
    todos = todos.filter((todo) => todo.id !== parseInt(target.id));
    save();

    target.remove(); 
}
"삭제" 버튼을 클릭하면 해당 li 요소를 삭제하고 todos 배열에서도 제거한 후 저장.


5. 할 일 추가 기능
const addItem = (todo) => {
    if (todo.text !== '') {
        const li = document.createElement('li');
        const span = document.createElement('span');
        const button1 = document.createElement('button'); 
        const button2 = document.createElement('button'); 
        
        span.innerText = `${todo.priority} 순위: ${todo.text}`;
        button1.innerText = '수정';
        button2.innerText = '삭제';
        button1.addEventListener('click', UpdateItem);
        button2.addEventListener('click', delItem);
        
        li.appendChild(span);
        li.appendChild(button1);
        li.appendChild(button2);
        ul.appendChild(li);
        li.id = todo.id;
    }
}
할 일을 li 요소로 만들어 ul에 추가.
"수정" 버튼과 "삭제" 버튼을 함께 추가하여 기능 연결.


6. 할 일 목록 렌더링
const renderTodos = () => {
    ul.innerHTML = '';
    todos.forEach(addItem);
}
todos 배열을 기반으로 ul을 다시 그리는 함수.


7. 우선순위 정렬
const sortTodos = () => {
    todos.sort((a, b) => a.priority - b.priority);
}
우선순위가 높은 할 일이 먼저 표시되도록 정렬.


8. 할 일 입력 처리
const handler = (event) => {
    event.preventDefault();

    const priority = parseInt(prompt("우선순위를 입력하세요 (숫자입력): "));
    if (isNaN(priority)) return;

    const todo = {
        id: Date.now(),
        text: input.value,
        priority: priority,
    }; 

    todos.push(todo);
    sortTodos();
    renderTodos(); 
    save();
    input.value = '';
}
사용자가 input에 내용을 입력하고 등록 버튼을 누르면 새로운 할 일이 추가됨.
우선순위를 입력받아 객체로 저장하고 정렬한 후 렌더링.


9. 페이지 로드시 로컬 스토리지에서 데이터 불러오기
const init = () => {
    const userTodos = JSON.parse(localStorage.getItem('todos'));
    if (userTodos) {
        userTodos.forEach((todo) => {
            addItem(todo);
        });
        sortTodos();
        todos = userTodos;
    }
}
localStorage에서 기존 데이터를 불러와서 todos 배열에 저장하고 화면에 표시.


10. 검색 기능
const show = (event) => {
    event.preventDefault();
    const searchValue = searchInput.value.trim().toLowerCase();
    if (searchValue === "") {
        sortTodos();
        renderTodos(); 
        return;
    }

    const filteredTodos = todos.filter((todo) =>
        todo.text.toLowerCase().includes(searchValue)
    );

    ul.innerHTML = '';
    filteredTodos.sort((a, b) => a.priority - b.priority);
    filteredTodos.forEach(addItem); 
}
입력된 검색어가 포함된 할 일만 필터링해서 화면에 출력.
검색 결과도 우선순위대로 정렬.


11. 이벤트 리스너 등록
form.addEventListener('submit', handler);
searchButton.addEventListener('click', show);
init();
할 일 추가 (form 제출)
검색 기능 실행 (searchButton 클릭)
페이지 로드시 기존 할 일 불러오기 (init 실행)


할일 추가	사용자가 입력하면 리스트에 추가하고 저장
할일 수정	기존 할 일의 내용을 변경하고 우선순위도 수정 가능
할일 삭제	선택한 할 일을 리스트에서 제거
로컬 스토리지 저장	페이지를 새로고침해도 할 일 목록이 유지됨
우선 순위 정렬	숫자가 작은 우선순위가 먼저 출력됨
검색 기능	특정 키워드가 포함된 할 일만 필터링 
            빈칸으로 검색하면 모든 할일 목록이 표시됨