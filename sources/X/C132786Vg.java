package X;

import java.nio.ByteBuffer;

/* renamed from: X.6Vg  reason: invalid class name and case insensitive filesystem */
public class C132786Vg implements AnonymousClass7fK {
    public Object A00;
    public Object A01;
    public final int A02;

    public C132786Vg(AnonymousClass6YX r1, StringBuilder sb, int i) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = sb;
    }

    public void B7b(C142246oZ r8, int i, boolean z) {
        String str;
        int i2 = this.A02;
        StringBuilder sb = (StringBuilder) this.A01;
        if (i2 != 0) {
            AnonymousClass63L r4 = r8.A00;
            AnonymousClass6TG r3 = r4.A03;
            ByteBuffer byteBuffer = r3.A01;
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(byteBuffer.order());
            int i3 = r4.A02;
            duplicate.position(i3);
            duplicate.limit(r4.A00 + i3);
            if ((duplicate.get(i) & 255) == 4) {
                sb.append("  at extension function ");
                sb.append((String) r3.A01(duplicate.getShort(i + 1) & 65535));
                sb.append(10);
            }
            sb.append("  at offset ");
            sb.append(i - r3.A02[2].A02);
            sb.append("  (offset ");
            sb.append(i - i3);
            sb.append(" in function ");
            sb.append((String) r3.A01(r4.A01));
            sb.append(')');
            sb.append(" in script \"");
            sb.append(r3.A00);
            sb.append('\"');
            str = "\n";
        } else {
            if (z) {
                sb.append("\n");
            }
            str = "(unsymbolicated)";
        }
        sb.append(str);
    }
}
