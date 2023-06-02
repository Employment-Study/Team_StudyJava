package ch14_Stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MakeStream2 {
public static void main(String[] args) {
//	5. 람다식-iterator(), generate()
//	람다식을 매개변수로 받아서, 이 람다식에 의해 계산되는 값들을 요소로 하는 무한 스트림을 생성
	
//	static <T> Stream<T> iterate(T seed, unaryOperator<T> f)
//	static <T> Stream<T> generate(Supplier<T> s)
	
	// iterate() 는 seed로 지정된 값부터 해서 람다식 f에 의해 계산된 결과를 다시 seed값으로 해서 계산을 반복한다.
	// 0부터 시작해서 값이 2씩 계속 증가한다.
	Stream<Integer> evenStream = Stream.iterate(0,  n->n+2);
	evenStream.limit(5).forEach(System.out::print);
	System.out.println();
	//generate도 iterate()처럼 , 람다식에 의해 계산되는 값을 요소로 하는 무한 스트림을 생성해서 반환하지만, 이전 결과를 이용해서 다음 요소를 계산하지 않는다.
	//generate()에 정의 된 매개변수의 타입은 Supplier<T>이므로 매개변수가 없는 람다식만 허용된다.
	
	Stream<Double> randomStream = Stream.generate(Math::random);
	randomStream.limit(5).forEach(System.out::print);
	System.out.println();
	Stream<Integer> oneStream 	= Stream.generate(() -> 1);
	oneStream.limit(5).forEach(System.out::print);
	System.out.println();
	
	// 한가지 주의할 점 : iterate()와 generate()에 의해 생성된 스트림을 아래와 같이 기본형 스트림 타입의 참조변수로 다룰 수 없다는 것
//		IntStream evenStream2 = Stream.iterate(0, n->n+2);					//Err
//		DoubleStream randomStream2 = Stream.generate(Math::random);			//Err
	
	//위 코드를 굳이 필요하다면 , mapToInt()와 같은 메서드로 변환을 해야 한다.
	IntStream evenStream3 =  Stream.iterate(0, n->n+2).mapToInt(Integer::valueOf);
	evenStream3.limit(5).forEach(System.out::print);
	System.out.println();
	Stream<Integer> stream = evenStream3.boxed();	//Intstream > Stream<integer>

	
	
	
}
}
