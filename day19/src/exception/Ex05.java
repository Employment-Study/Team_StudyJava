package exception;

public class Ex05 {
	public static void main(String[] args) throws InterruptedException{
//		throws : callee 에서 발생한 예외를 caller에게 전가시키다.
//		호출 당하는 곳에서 발생한 예외를 호출한사람에게 전가시킨다. Main을 호출시킨 시스템에 전가시킨다.
//		callee에서 발생한 예외를  callee에서 처리하고 싶으면 try-catch
//		callee에서 발생한 예외를 caller에게 전가시켜서 "모아서" 처리하는 구조로 만들고 싶다면 throws
//		예외를 무한정 전가시키기 위함이 아니다.
//		하위 코드에서 발생한 예외를 적절한 상위 단계에서 모아서 일괄적으로 처리하고 
//		예외 처리의 효율성을 증대시키기 위한 문법이다.(흔히 말하는 폭탄돌리기를 위함이 아니다.)
		
		for(int i=5;i != -1;i--) {
			System.out.println(i);
//			try {
				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//			}
		}
		System.out.println("End");
	}
	
}
