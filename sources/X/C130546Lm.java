package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Lm  reason: invalid class name and case insensitive filesystem */
public final class C130546Lm {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public String A07;
    public List A08;
    public List A09;

    public C130546Lm() {
        this((String) null, (List) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1023);
    }

    public /* synthetic */ C130546Lm(String str, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        ArrayList arrayList = null;
        str = (i & 1) != 0 ? "" : str;
        float f8 = 0.0f;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        float f9 = 1.0f;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f9 = (i & 32) == 0 ? f5 : f9;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f8 = (i & 128) == 0 ? f7 : f8;
        list = (i & 256) != 0 ? C196389Zl.A00 : list;
        arrayList = (i & 512) != 0 ? AnonymousClass001.A0I() : arrayList;
        this.A07 = str;
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = f4;
        this.A04 = f9;
        this.A05 = f6;
        this.A06 = f8;
        this.A09 = list;
        this.A08 = arrayList;
    }
}
