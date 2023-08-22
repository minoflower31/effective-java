# Item8. finalizer와 cleaner 사용을 피하라

## finalizer를 사용하지 않는 이유

- 오동작, 낮은 성능, 이식성 문제의 원인이 됨
- 예측할 수 없음
- 예외가 발생되어도 알 수 없음. 이후에 처리할 작업이 있어도 종료돼버림
- 그래서 java9부터 deprecated API로 지정하고 cleaner를 소개
  - 자신을 수행할 수 있는 스레드를 제어할 수 있음 
  - 하지만 여전히 느리고, 예측할 수 없음
- finalizer, cleaner 모두 제 때 실행하지 못함. 가비지 컬렉션에 따라 천차만별

## 그래서 대안이 뭔데?

### **AutoCloseable 구현 && try - catch - finally**