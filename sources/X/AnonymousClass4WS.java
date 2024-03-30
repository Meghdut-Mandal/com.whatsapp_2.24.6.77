package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.4WS  reason: invalid class name */
public class AnonymousClass4WS extends AnonymousClass3PM {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final int A0A;

    public AnonymousClass4WS(AnonymousClass33T r1, AnonymousClass3Sd r2, String str, String str2, String str3, String str4, List list, Map map, byte[] bArr, byte[] bArr2, int i) {
        this.A0A = i;
        this.A00 = r2;
        this.A05 = r1;
        switch (i) {
            case 0:
                this.A08 = str;
                this.A09 = str2;
                this.A07 = str3;
                break;
            case 1:
            case 2:
                this.A07 = str;
                this.A08 = str2;
                this.A04 = bArr;
                this.A02 = bArr2;
                this.A09 = str3;
                break;
            default:
                this.A09 = str;
                this.A07 = str2;
                this.A08 = str3;
                break;
        }
        this.A04 = bArr;
        this.A02 = bArr2;
        this.A06 = str4;
        this.A01 = map;
        this.A03 = list;
    }
}
