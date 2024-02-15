prisonerAconfession=True
prisonerBconfession=False

if not prisonerAconfession and not prisonerBconfession:
    print('죄수 A, B 각자 6개월씩 복역')
elif not prisonerAconfession and prisonerBconfession:
    print('죄수 A 10년 복역, 죄수 B 석방')
elif prisonerAconfession and not prisonerBconfession:
    print('죄수 A 석방, 죄수 B 10년 복역')
else :
    print('죄수 A, B 각자 5년씩 복역')
