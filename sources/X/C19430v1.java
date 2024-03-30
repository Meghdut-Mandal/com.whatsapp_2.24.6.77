package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* renamed from: X.0v1  reason: invalid class name and case insensitive filesystem */
public abstract class C19430v1 {
    public static final long A00 = Runtime.getRuntime().maxMemory();
    public static final C18950u5 A01 = new C18950u5(10, SearchActionVerificationClientService.NOTIFICATION_ID, 100000, false);
    public static final C18950u5 A02 = new C18950u5(10, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false);
    public static final C18950u5 A03 = new C18950u5(10, 100, 1000, false);
    public static final String A04;
    public static final String A05;
    public static final String A06 = String.valueOf(604800);
    public static final String A07;
    public static final String A08 = Character.toString(8239);
    public static final String A09 = Character.toString(160);
    public static final String A0A;
    public static final String A0B;
    public static final String A0C;
    public static final Charset A0D;
    public static final Map A0E = new C36311k6(0);
    public static final byte[] A0F = {6, 0};
    public static final byte[] A0G = {6, 5};
    public static final byte[] A0H = {6, 1};
    public static final byte[] A0I = {6, 6};
    public static final byte[] A0J = {6, 2};
    public static final int[] A0K = {7776000, 604800, 86400, 0};
    public static final int[] A0L = {86400, 604800, 7776000, 0};
    public static final Long[] A0M = new Long[0];
    public static final String[] A0N = new String[0];

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("com.whatsapp");
        sb.append(".fileprovider");
        A07 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android.resource://");
        sb2.append("com.whatsapp");
        sb2.append("/");
        A04 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("com.whatsapp");
        sb3.append("_preferences");
        A0A = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("com.whatsapp");
        sb4.append(".permission.BROADCAST");
        A0C = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("https://play.google.com/apps/testing/");
        sb5.append("com.whatsapp");
        A05 = sb5.toString();
        Charset charset = StandardCharsets.UTF_8;
        A0D = charset;
        A0B = charset.name();
    }
}
