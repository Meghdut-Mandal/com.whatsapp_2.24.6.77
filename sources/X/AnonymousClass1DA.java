package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1DA  reason: invalid class name */
public class AnonymousClass1DA {
    public static final List A06;
    public static final List A07;
    public static final List A08;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;

    static {
        ArrayList arrayList = new ArrayList();
        A07 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        A06 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        A08 = arrayList3;
        arrayList.add("image/jpg");
        arrayList.add("image/jpeg");
        arrayList.add("image/png");
        arrayList.add("image/webp");
        arrayList2.add("image/gif");
        arrayList3.add("video/x.looping_mp4");
        arrayList3.add("video/mp4");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("container: ");
        sb.append(this.A01);
        sb.append(", video: ");
        sb.append(this.A02);
        sb.append(", audio: ");
        sb.append(this.A00);
        sb.append(", problems: ");
        sb.append(this.A05);
        return sb.toString();
    }

    public AnonymousClass1DA(int i, int i2, int i3, boolean z) {
        this.A04 = -1;
        this.A03 = -1;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A05 = z;
    }

    public AnonymousClass1DA() {
        this(0, 0, 0, false);
    }
}
