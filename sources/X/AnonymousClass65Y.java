package X;

import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.65Y  reason: invalid class name */
public abstract class AnonymousClass65Y {
    public void A00(CancellationSignal cancellationSignal, C1275868w r15, List list) {
        FileInputStream A0U;
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (!cancellationSignal.isCanceled()) {
                File A01 = r15.A01(A0C);
                if (!A01.exists()) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("EntityTableImporter/Failed to import file '");
                    A0u.append(A0C);
                    C36321k7.A1Z(A0u, "'.");
                } else {
                    C116555km r0 = new C116555km(new C102034yg());
                    try {
                        A0U = C90524aI.A0U(A01);
                        JSONObject A012 = AnonymousClass14X.A01(A0U);
                        if (A012 != null) {
                            A0U.close();
                            try {
                                ArrayList A00 = r0.A00.A00(A012);
                                if (this instanceof C102014ye) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                C164157rM r4 = new C164157rM(this, i);
                                if (A00.size() <= 0) {
                                    continue;
                                } else if (!cancellationSignal.isCanceled()) {
                                    int i2 = 0;
                                    while (i2 < A00.size()) {
                                        List<Long> subList = A00.subList(i2, Math.min(A00.size(), i2 + 100));
                                        if (r4.A01 != 0) {
                                            Iterator it2 = subList.iterator();
                                            while (it2.hasNext()) {
                                                long A0D = C36391kE.A0D(it2);
                                                C102014ye r8 = (C102014ye) r4.A00;
                                                r8.A00.A00.A08(r8.A02, A0D);
                                            }
                                            C102014ye r1 = (C102014ye) r4.A00;
                                            C65653Sy r6 = r1.A00.A00;
                                            String str = r1.A02;
                                            String str2 = r1.A01;
                                            if (!subList.isEmpty()) {
                                                AnonymousClass1M0 A05 = r6.A00.A05();
                                                try {
                                                    StringBuilder A0v = AnonymousClass000.A0v(str2);
                                                    A0v.append(" IN ");
                                                    String A0q = AnonymousClass000.A0q(AnonymousClass1M2.A00(subList.size()), A0v);
                                                    String[] strArr = new String[subList.size()];
                                                    int i3 = 0;
                                                    for (Long valueOf : subList) {
                                                        strArr[i3] = String.valueOf(valueOf);
                                                        i3++;
                                                    }
                                                    A05.A02.A03(str, A0q, "BackupChangesStore/DELETE_ENTITIES", strArr);
                                                    A05.close();
                                                } catch (Throwable th) {
                                                    th.addSuppressed(th);
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            Iterator it3 = subList.iterator();
                                            while (it3.hasNext()) {
                                                ((C102004yd) r4.A00).A00.A01.A08("message", C36391kE.A0D(it3));
                                            }
                                            C130556Ln r7 = ((C102004yd) r4.A00).A00;
                                            ArrayList A14 = C36441kJ.A14(100);
                                            Iterator it4 = subList.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    long A0D2 = C36391kE.A0D(it4);
                                                    if (cancellationSignal.isCanceled()) {
                                                        break;
                                                    }
                                                    AnonymousClass3T1 A0R = C36421kH.A0R(r7.A09, A0D2);
                                                    if (A0R != null) {
                                                        A14.add(A0R);
                                                    }
                                                } else {
                                                    if (A14.size() > 0) {
                                                        r7.A05.A0v(A14, 0);
                                                    }
                                                    Iterator it5 = A14.iterator();
                                                    while (it5.hasNext()) {
                                                        r7.A04.A01(C36391kE.A0l(it5).A1J);
                                                    }
                                                    Iterator it6 = subList.iterator();
                                                    while (it6.hasNext()) {
                                                        AnonymousClass3T1 A0R2 = C36421kH.A0R(r7.A09, C36391kE.A0D(it6));
                                                        C123705wx r62 = r7.A02;
                                                        if (A0R2 == null) {
                                                            r62.A00++;
                                                        } else {
                                                            r62.A01++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i2 = C90524aI.A04(subList, i2);
                                    }
                                } else {
                                    return;
                                }
                            } catch (JSONException e) {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("JsonEntitiesFileParser/Failed to process JSON file '");
                                throw new IOException(AnonymousClass000.A0p(A01.getName(), "'", A0u2), e);
                            }
                        } else {
                            throw new JSONException("Can't read JSON file.");
                        }
                    } catch (JSONException e2) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        A0u3.append("JsonEntitiesFileParser/Failed to read JSON with entities from file '");
                        throw new IOException(AnonymousClass000.A0p(A01.getName(), "'", A0u3), e2);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            } else {
                return;
            }
        }
        return;
        throw th;
    }
}
