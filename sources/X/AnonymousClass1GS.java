package X;

import com.whatsapp.util.Log;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.1GS  reason: invalid class name */
public class AnonymousClass1GS extends AnonymousClass1CJ {
    public final AnonymousClass1GT A00 = new AnonymousClass1GT();
    public final List A01 = new ArrayList();

    public void A05(List list) {
        List<Number> list2;
        List list3 = list;
        int size = list3.size();
        AnonymousClass1GT r7 = this.A00;
        LinkedHashSet linkedHashSet = r7.A03;
        if (size == linkedHashSet.size()) {
            list2 = this.A01;
            super.A05(list2);
        } else {
            HashSet hashSet = new HashSet(list3.size());
            Iterator it = linkedHashSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (list3.contains(Integer.valueOf(i))) {
                    hashSet.add(next);
                }
                i++;
            }
            list2 = this.A01;
            for (Number number : list2) {
                int intValue = number.intValue();
                if (intValue != this.A03.A01) {
                    AnonymousClass1CT A012 = A01(intValue);
                    AnonymousClass1CE r11 = A012.A04;
                    ByteBuffer A02 = r11.A02();
                    int limit = A02.limit();
                    A02.position(8);
                    String str = null;
                    long j = 0;
                    try {
                        for (int position = A02.position(); position < limit; position = A02.position()) {
                            AnonymousClass1CX A03 = AnonymousClass1CW.A03(A02);
                            int i2 = A03.A01;
                            if (i2 == 0) {
                                int i3 = A03.A00;
                                if (i3 == 6005) {
                                    str = (String) A03.A02;
                                } else if (i3 == 47) {
                                    long intValue2 = (long) ((Integer) A03.A02).intValue();
                                    if (intValue2 > j) {
                                        j = intValue2;
                                    }
                                }
                            } else if (i2 == 1 && hashSet.contains(str)) {
                                r11.A01 = Math.min(r11.A01, position);
                                ByteBuffer byteBuffer = r11.A02;
                                int position2 = byteBuffer.position();
                                byteBuffer.position(position);
                                byteBuffer.put((byte) 4);
                                byteBuffer.position(position2);
                            }
                        }
                        A012.A02();
                        if ((System.currentTimeMillis() / 1000) - j > 604800) {
                            super.A05(Collections.singletonList(number));
                        }
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("privateStatseventbuffermanager/cleanbuffer unexpected errors ");
                        sb.append(th.toString());
                        Log.e(sb.toString());
                        super.A05(Collections.singletonList(number));
                    }
                } else {
                    throw new IllegalStateException("Trying to compact the current buffer");
                }
            }
        }
        r7.A01 = new byte[0];
        r7.A00 = 0;
        linkedHashSet.clear();
        r7.A02.clear();
        list2.clear();
    }

    public AnonymousClass1GS(C19760wT r2, AnonymousClass1CC r3, C20900yL r4, RandomAccessFile randomAccessFile, int i, int i2) {
        super(r2, r3, r4, randomAccessFile, i, i2);
    }
}
