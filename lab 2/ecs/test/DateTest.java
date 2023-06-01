import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {



  @Test
  void nextDate_sample1() {
    Date d = new Date(1700,06,20);
    assertEquals(new Date(1700,06,21), d.nextDate());
  }


  @Test
  void nextDate_sample2() {
    Date d = new Date(2005,04,15);
    assertEquals(new Date(2005,04,16), d.nextDate());
  }

  @Test
  void nextDate_sample3() {
    Date d = new Date(1901,07,20);
    assertEquals(new Date(1901,07,21), d.nextDate());
  }

  @Test
  void nextDate_sample4() {
    Date d = new Date(3456,03,27);
    assertEquals(new Date(3456,03,28), d.nextDate());
  }

  @Test
  void nextDate_sample5() {
    Date d = new Date(1500,02,17);
    assertEquals(new Date(1500,02,18), d.nextDate());
  }

  @Test
  void nextDate_sample6() {
    Date d = new Date(1700,06,29);
    assertEquals(new Date(1700,06,30), d.nextDate());
  }

  @Test
  void nextDate_sample7() {
    Date d = new Date(1800,11,29);
    assertEquals(new Date(1800,11,30), d.nextDate());
  }

  @Test
  void nextDate_sample8() {
    Date d = new Date(3453,01,29);
    assertEquals(new Date(3453,01,30), d.nextDate());
  }

  @Test
  void nextDate_sample9() {
    Date d = new Date(444,02,29);
    assertEquals(new Date(444,03,01), d.nextDate());
  }

  @Test
  void nextDate_sample10() {
    Date d = new Date(2005,04,30);
    assertEquals(new Date(2005,05,01), d.nextDate());
  }

  @Test
  void nextDate_sample11() {
    Date d = new Date(3453,01,30);
    assertEquals(new Date(3453,01,31), d.nextDate());
  }

  @Test
  void nextDate_sample12() {
    Date d = new Date(3456,03,30);
    assertEquals(new Date(3456,03,31), d.nextDate());
  }

  @Test
  void nextDate_sample13() {
    Date d = new Date(1901,07,31);
    assertEquals(new Date(1901,8,01), d.nextDate());
  }

  @Test
  void nextDate_sample14() {
    Date d = new Date(3453,01,31);
    assertEquals(new Date(3453,02,01), d.nextDate());
  }

  @Test
  void nextDate_sample15() {
    Date d = new Date(3456,12,31);
    assertEquals(new Date(3457,01,01), d.nextDate());
  }



  @Test
  void nextDate_sample16() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1550, 2, 31).nextDate(), "Jour doit etre au maximum 28 car année non bissextile.");
  }

  @Test
  void nextDate_sample17() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1550, 2, 29).nextDate() , "Jour doit etre au maximum 28 car année non bissextile.");
  }

  @Test
  void nextDate_sample18() {
    assertThrows(IllegalArgumentException.class, () -> new Date(-1, 10, 20).nextDate(), "L'année doit etre supérieure ou égale à 0.");
  }

  @Test
  void nextDate_sample19() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1458, 15, 12).nextDate(), "Le mois doit etre entre 1 et 12. ");
  }

  @Test
  void nextDate_sample20() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1975, 6, -50).nextDate(), "Jour doit être entre 1 et 31.");
  }








  }