package com.example.harpreet.peacocksolar;
import com.example.harpreet.peacocksolar.UtilsClasses.Validator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class ValidatorTest {

    Validator validator;
    @Test
    public void isValidEmail() {
        String input[] = new String[7];
        boolean output[] = new boolean[7];
        boolean expected[] = new boolean[7];

        input[0] = "";
        input[1] = "hdsfkgmail.com";
        input[2] = "@gmail.com";
        input[3] = "asdfhl@gmail.";
        input[4] = "honey@hotmail.co.in";
        input[5] = "adjkh@dfs.ac.in";
        input[6] = "adjkh@dfs.com";

        expected[0] = false;
        expected[1] = false;
        expected[2] = false;
        expected[3] = false;
        expected[4] = false;
        expected[5] = true;
        expected[6] = true;


        for (int i = 0; i < input.length; i++) {
            output[i] = Validator.isValidEmail(input[i]);
            expected[i] = output[i];
        }
        assertArrayEquals(expected, output);
    }
    @Test
    public void isValidMobileNumber() {
        String input[] = new String[7];
        boolean actual[] = new boolean[7];
        boolean expected[] = new boolean[7];

        input[0]="";
        input[1]="8639121922";
        input[2]="219837w123";
        input[3]="1231232789";
        input[4]="+919721327304";
        input[5]="09378328721";
        input[6]="2379187283772";

        expected[0]=false;
        expected[1]=true;
        expected[2]=false;
        expected[3]=true;
        expected[4]=false;
        expected[5]=false;
        expected[6]=false;

        validator = new Validator();

        for(int i=0;i<input.length;i++) {
            actual[i] = validator.isValidMobileNumber(input[i]);
            
        }
        assertArrayEquals(expected,actual);
    }

}