@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals(пользователю 18 лет или больше, true ,isAdult); 
    // System.out.println(пользователю 18 лет или больше);
	// Напиши код здесь
}
