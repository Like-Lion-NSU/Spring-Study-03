package todo.entity.Service;

import todo.entity.Dto.TodoEditRequestDto;
import todo.entity.Dto.TodoSaveRequestDto;
import todo.entity.Entity.Todo;

import java.util.List;
import java.util.Optional;
// todo의 CRUD기능을 호출하기 위한 메서드
public interface TodoService {
   public  Long saveTodo(String id, TodoSaveRequestDto todoSaveRequestDto);// 투두 생성
   public List<Todo> findTodos(Long id);//투두 전체 조회
   public Optional<Todo> findById(Long id);//투두 조회
   public void editTodo(Long id, TodoEditRequestDto todoEditRequestDto);// 투두 수정
   public void deleteTodo(Long id);//투두 삭제
}
