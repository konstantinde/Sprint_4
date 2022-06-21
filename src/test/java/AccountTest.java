import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    public void checkNameWithLengthLess3Symbols() {
        Account account = new Account("Ти");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameWithLengthMore19Symbols() {
        Account account = new Account("Длинное Наименование");
        assertFalse(account.checkNameToEmboss());
    }


    @Test
    public void checkNameWithLength3Symbols() {
        Account account = new Account("Т и");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkNameWithLength19Symbols() {
        Account account = new Account("Имя19букв Фамилия19");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkNameWithOneSpaceBetweenNameAndLastName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkNameWithoutSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameWithSpaceBeforeName() {
        Account account = new Account(" Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameWithSpaceAfterName() {
        Account account = new Account("Шаламе ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameWithTwoSpaceInName() {
        Account account = new Account("Шаламе Ти Моти");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameWithEmptyName() {
        Account account = new Account("");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameWithNullName() {
        Account account = new Account(null);
        assertFalse(account.checkNameToEmboss());
    }
}
