package com.hisao.fiber;

import com.hisao.fiber.Models.Information;

import org.junit.Test;

import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by viniciushisao.
 */
public class InformationTest {

    /**
     * TODO
     * max size?
     * pattern?
     */
    @Test
    public void correct_Format(){
        assertTrue(Information.isValidFormat("ED"));
        assertFalse(Information.isValidFormat(null));
        assertFalse(Information.isValidFormat(""));
    }

    /**
     * TODO
     * max size?
     * some pattern?
     */
    @Test
    public void correct_AppID(){
        assertTrue(Information.isValidAppid("157"));
        assertFalse(Information.isValidAppid(""));
        assertFalse(Information.isValidAppid(null));
    }

    /**
     * TODO
     * max size?
     * is there some pattern to check?
     */
    @Test
    public void correct_Google_ad_id(){
        assertTrue(Information.isValidGoogle_ad_id("38400000-8cf0-11bd-b23e-10b96e40000d"));
        assertFalse(Information.isValidGoogle_ad_id(""));
        assertFalse(Information.isValidGoogle_ad_id(null));
    }

    @Test
    public void correct_Locale(){
        assertTrue(Information.isValidLocale("de"));
        assertFalse(Information.isValidLocale(""));
        assertFalse(Information.isValidLocale("abc"));
        assertFalse(Information.isValidLocale(null));
    }

    /**
     * TODO
     * pattern ?
     */
    @Test
    public void correct_Os_version(){
        assertTrue(Information.isValidOs_version("4.1.1"));
        assertFalse(Information.isValidOs_version(""));
        assertFalse(Information.isValidOs_version(null));
    }

    /**
     * TODO
     * make it long
     */

    @Test
    public void correct_Timestamp(){
        assertTrue(Information.isValidTimestamp("1312471066"));
        assertFalse(Information.isValidTimestamp(""));
        assertFalse(Information.isValidTimestamp(null));
    }

    @Test
    public void correct_Uid(){
        assertTrue(Information.isValidUid("player1"));
        assertFalse(Information.isValidUid(""));
        assertFalse(Information.isValidUid(null));
    }



}
