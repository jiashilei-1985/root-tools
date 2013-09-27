package com.yugioh.android.define;

public class NetworkDefine {

	public static final String BASE_URL = "http://rarnu.7thgen.info/yugioh/";
	public static final String UPDATE_URL = BASE_URL + "update.php";
	public static final String UPDATE_PARAM_FMT = "ver=%d&cardid=%d";

	public static final String RECOMMAND_URL = BASE_URL + "get_recommand.php";
	public static final String RECOMMAND_IMAGE_URL = BASE_URL + "recommand/";

	public static final String URL_APK = BASE_URL + "download/YuGiOhCard.apk";
	public static final String URL_DATA = BASE_URL + "download/yugioh.zip";

	public static final String URL_CARD_IMAGE_FMT = "http://p.ocgsoft.cn/%d.jpg";
    public static final String URL_OCGSOFT_BASE = "http://ocgsoft.cn/api/";
    public static final String URL_OCGSOFT_GET_PACKAGE = URL_OCGSOFT_BASE + "packages";
    public static final String URL_OCGSOFT_GET_PACKAGE_CARD = URL_OCGSOFT_BASE + "cards";
}
