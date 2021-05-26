# BUILDER를 사용하는 이유

생성자, 정적 팩터리 메소드의 공통적인 제약 = 많은 매개변수에 대응
<br></br>

## 1. 점층적 생성자 패턴
필수 매개변수 받는 생성자, 선택 매개변수 1개 받는, 2개받는..., 전부 다 받는 생성자.

모든 경우 대비해 생성자를 만들기, 매개변수 개수확인, 짝 맞는지 확인 등..

## 2. JavaBeans pattern
매개변수 없는 생성자로 객체 생성 --> setter로 메서드 호출해 매개변수 값 설정  

객체 하나 만드는데 메서드 여러 개 호출, 완전히 생성되기 전까지 일관성X

## 3. Builder pattern

필수 매개변수만으로 생성자(나 정적 팩토리) 호출해 빌더 객체 얻기

세터 메서드로 원하는 선택 매개변수 설정

빌더 = 생성할 클래스 안에 정적 멤버 클래스로 만들기

각 하위 클래스의 빌더가 정의한 build 메서드는 해당하는 하위 클래스 반환(covariant return typing)

클라이언트가 _형변환 신경쓰지 않고_ 빌더 사용가능

* __가변인수(varargs)__ 매개변수 여러 개 사용 가능 
  - 메서드 나눠서 선언
  - 메서드 여러 번 호출, 호출 시 넘겨진 매개변수 하나의 필드로 모으기


* 예제

``` java
NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addToppping(ONION).build();
Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
```

<br></br>
### ✔매개변수 4개 이상, 다수가 필수 아니거나 같은 타입일 때 BUILDER 사용하기
