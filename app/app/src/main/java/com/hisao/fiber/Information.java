package com.hisao.fiber;

import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by suzukivi on 15/02/2016.
 */
public class Information {

    /*
    TODO add non mandatory parameters
     */

    /**
     *The response format ( lower case), selected by the ‘extension’ after ‘offers’.
     * json or xml
     */
    private String format;

    /**
     * The Fyber Application ID for your application.
     * 157
     */
    private String appid;

    /**
     * The unique User ID, as used internally in your application.
     * player1
     */
    private String uid;

    /**
     * The locale used for the offer descriptions.
     * de
     */
    private String locale;

    /**
     * 	Current version of the users Operating System, retrieve via android.os.Build.VERSION.RELEASE
     * 	4.1.1
     */
    private String os_version;

    /**
     * The time the request is being sent by the device.
     * 1312471066
     */
    private String timestamp;

    /**
     * The hash that signs the whole request.
     * eff26c67f527e6817bf6 935c75f8cc5cc5cffac2
     */
    private String hashkey;

    /**
     * The Google advertising ID obtained via AdvertisingIdClient.getAdvertisingIdInfo(mContext).getId();
     * 38400000-8cf0-11bd-b23e-10b96e40000d
     */
    private String google_ad_id;

    /**
     * Retrieves whether the user has limit ad tracking enabled or not. Obtained via AdvertisingIdClient.getAdvertisingIdInfo(mContext).isLimitAdTrackingEnabled()
     * true or false
     */
    private boolean google_ad_id_limited_tracking_enabled;

    public boolean isGoogle_ad_id_limited_tracking_enabled() {
        return google_ad_id_limited_tracking_enabled;
    }

    public void setGoogle_ad_id_limited_tracking_enabled(boolean google_ad_id_limited_tracking_enabled) {
        this.google_ad_id_limited_tracking_enabled = google_ad_id_limited_tracking_enabled;
    }

    public String getGoogle_ad_id() {
        return google_ad_id;
    }

    public void setGoogle_ad_id(String google_ad_id) {
        this.google_ad_id = google_ad_id;
    }


    /**
     *  1 Get all request parameters and their values (except hashkey)
     *  2 Order theses pairs alphabetically by parameter name
     *  3 Concatenate all pairs using = between key and value and & between the pairs.
     *  4 Concatenate the resulting string with & and the API Key handed out to you by Fyber.
     *  5 Hash the whole resulting string, using SHA1. The resulting hashkey is then appended to the request as a separate
     */
    public String getHashkey() {

        if (this.hashkey == null || this.hashkey.isEmpty()){

            hashkey = ApplicationConstants.APPID + "=" + getAppid() + "&" +
                    ApplicationConstants.FORMAT + "=" + getFormat() + "&" +
                    ApplicationConstants.GOOGLE_AD_ID + "=" + getGoogle_ad_id() + "&" +
                    ApplicationConstants.GOOGLE_AD_ID_LIMITED_TRACKING_ENABLE + "=" + isGoogle_ad_id_limited_tracking_enabled() + "&" +
                    ApplicationConstants.LOCALE + "=" + getLocale() + "&" +
                    ApplicationConstants.OS_VERSION + "=" + getLocale() + "&" +
                    ApplicationConstants.TIMESTAMP + "=" + getTimestamp() + "&" +
                    ApplicationConstants.UID + "=" + getUid() + "&" +
                    ApplicationConstants.API_KEY;

            try {
                hashkey = AeSimpleSHA1.SHA1(hashkey);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return hashkey;
    }
    /**
     * Sample:
     * http://api.fyber.com/feed/v1/offers.json?appid=[APP_ID]&uid=[USER_ID]&ip=[IP_ADDRESS]&
     * locale=[LOCALE]&device_id=[DEVICE_ID]&ps_time=[TIMESTAMP]&pub0=[CUSTOM]&
     * timestamp=[UNIX_TIMESTAMP]&offer_types=[OFFER_TYPES]&google_ad_id=[GAID]&
     * google_ad_id_limited_tracking_enabled=[GAID ENABLED]&hashkey=[HASHKEY]
     */

    public String getParams(){

        String ret = ApplicationConstants.APPID + "=" + getAppid() + "&" +
                ApplicationConstants.FORMAT + "=" + getFormat() + "&" +
                ApplicationConstants.GOOGLE_AD_ID + "=" + getGoogle_ad_id() + "&" +
                ApplicationConstants.GOOGLE_AD_ID_LIMITED_TRACKING_ENABLE + "=" + isGoogle_ad_id_limited_tracking_enabled() + "&" +
                ApplicationConstants.LOCALE + "=" + getLocale() + "&" +
                ApplicationConstants.OS_VERSION + "=" + getLocale() + "&" +
                ApplicationConstants.TIMESTAMP + "=" + getTimestamp() + "&" +
                ApplicationConstants.UID + "=" + getUid() + "&" +
                ApplicationConstants.HASHKEY + "=" + getHashkey();


        Log.d("LOG", "Information:getParams " + ret);
        return ret;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    // TODO check all the validators

    public static boolean isValidFormat(String format){
        if (format == null || format.isEmpty())
            return false;
        return true;
    }

    public static boolean isValidAppid(String appid){
        if (appid == null || appid.isEmpty())
            return false;
        return true;
    }

    public static boolean isValidUid(String uid){
        if (uid == null || uid.isEmpty())
            return false;
        return true;
    }

    public static boolean isValidLocale(String locale){
        if (locale == null || locale.isEmpty())
            return false;
        return true;
    }

    public static boolean isValidOs_version(String os_version){
        if (os_version == null || os_version.isEmpty())
            return false;
        return true;
    }
    //TODO check the timesptamp date instead of string
    public static boolean isValidTimestamp(String timestamp){
        if (timestamp == null || timestamp.isEmpty())
            return false;
        return true;
    }

    public static boolean isValidGoogle_ad_id(String google_ad_id){
        if (google_ad_id == null || google_ad_id.isEmpty())
            return false;
        return true;
    }

    public String getOs_version() {
        return os_version;
    }
}
