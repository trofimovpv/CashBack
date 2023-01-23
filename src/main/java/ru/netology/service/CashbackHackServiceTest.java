package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test

    public void amount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = 0;
        int expected = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void amountLess1000(){
        CashbackHackService service = new CashbackHackService();
        int actual = 1;
        int expected = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountMore1000(){
        CashbackHackService service = new CashbackHackService();
        int actual = 999;
        int expected = service.remain(1001);

        Assert.assertEquals(expected, actual);
    }



}
