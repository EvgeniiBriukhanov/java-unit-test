 // Напиши аннотацию для параметризованных тестов
@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
      this.age = age;
      this.result = result;
	 // Инициализируй поля класса в конструкторе
  }

   // Пометь метод аннотацией для параметров
      @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
        {17,false},
        {19,true},
        {20,true},
        {21,true},   
		 // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
      
	 // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
      
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals(Должно вернуться false, так как пользователь ne совершеннолетний, result, isAdult);
	}
}
