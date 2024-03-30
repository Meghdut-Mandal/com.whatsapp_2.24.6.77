package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4KQ  reason: invalid class name */
public class AnonymousClass4KQ implements C25711Hj {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public final void accept(Object obj) {
        String str;
        C1495671s B1k;
        Object obj2 = obj;
        switch (this.A03) {
            case 0:
                AnonymousClass2ZE r4 = (AnonymousClass2ZE) this.A00;
                C79593ty r2 = (C79593ty) this.A02;
                r4.A08.Bnx((Runnable) this.A01);
                Iterator it = ((List) obj2).iterator();
                while (true) {
                    boolean z = true;
                    while (true) {
                        if (it.hasNext()) {
                            boolean A1X = AnonymousClass000.A1X(it.next());
                            if (!z || !A1X) {
                                z = false;
                            }
                        } else {
                            r2.A0C(Boolean.valueOf(z));
                            C36341k9.A0w(C19980wp.A00(r4.A06).edit(), "critical_bootstrap_completed_timestamp", System.currentTimeMillis());
                            if (z) {
                                C608539p r22 = r4.A01;
                                Log.i("CompanionSyncdBootstrapManager/startNonCriticalBootstrapPhase started");
                                if (r22.A00.A0L()) {
                                    C80213v2.A01(r22.A05, r22, 4);
                                }
                                r4.A07.A0U(3, true);
                                ArrayList A0H = r4.A04.A0H();
                                ArrayList A0I = AnonymousClass001.A0I();
                                Iterator it2 = A0H.iterator();
                                while (it2.hasNext()) {
                                    A0I.add(C36371kC.A0d(it2));
                                }
                                int i = 0;
                                C18740tg.A0B(true);
                                ArrayList A0I2 = AnonymousClass001.A0I();
                                int size = A0I.size();
                                while (i < size) {
                                    int i2 = i + 500;
                                    A0I2.add(A0I.subList(i, Math.min(size, i2)));
                                    i = i2;
                                }
                                Iterator it3 = A0I2.iterator();
                                while (it3.hasNext()) {
                                    C20430xY r5 = r4.A05;
                                    C108515Tu r7 = C108515Tu.A0K;
                                    r5.A03(AnonymousClass6NS.A0D, r7, (Collection) it3.next(), false, true);
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                break;
            case 1:
                AnonymousClass1ST r6 = (AnonymousClass1ST) this.A00;
                AnonymousClass3T1 r52 = (AnonymousClass3T1) this.A01;
                Object obj3 = this.A02;
                byte[] bArr = (byte[]) obj2;
                if (!(r52.A0V() == null || bArr == null || bArr.length <= 0)) {
                    r6.A0B.A00(r52, new C35631j0(r52, bArr, obj3, 32));
                }
                r6.A04.A0H(new C35261iP((Object) r6.A08, 12, 28, (Object) r52));
                return;
            default:
                C29641Xk r9 = (C29641Xk) this.A00;
                AnonymousClass3T1 r62 = (AnonymousClass3T1) this.A01;
                AnonymousClass3L1 r8 = (AnonymousClass3L1) this.A02;
                C129166Fp r72 = (C129166Fp) obj2;
                AnonymousClass00C.A0D(r72, 3);
                if (r62.A0V() == null || r72.A0H() == null) {
                    if ((r62 instanceof AnonymousClass2bV) && r72.A0H() != null && (str = r8.A04) != null) {
                        File A0Z = r9.A01.A0Z(str);
                        try {
                            AnonymousClass6YY.A0I(A0Z, r72.A0H());
                            A0Z.getAbsolutePath();
                            r8.A09 = true;
                            r9.A04.A0n(r62, -1);
                        } catch (IOException e) {
                            C36321k7.A1M(A0Z, "ThumbnailDownloadMananger/whenDownloadComplete, exception when creating thumbnail file", AnonymousClass000.A0u(), e);
                        }
                    } else if (r62 instanceof AnonymousClass2bU) {
                        r9.A04.A0n(r62, -1);
                    }
                } else if (r62 instanceof AnonymousClass2bU) {
                    r9.A0E.A0H(r62);
                    if (r62.A0V() != null) {
                        r9.A09.A00(r62, new C35371ia(r62, r72, r8, r9, 19));
                    }
                }
                C133136Wx A012 = r72.A01();
                if (A012 != null && A012.A01 == 5) {
                    C29661Xm r1 = r9.A07;
                    try {
                        AnonymousClass1M0 A05 = r1.A02.A05();
                        try {
                            B1k = A05.B1k();
                            r62.A12((AnonymousClass3L1) null);
                            r1.A03.A05(r62, -1);
                            long j = r62.A1N;
                            C224114e r63 = A05.A02;
                            String[] A1R = C36441kJ.A1R();
                            C36341k9.A1W(A1R, j);
                            int A032 = r63.A03("mms_thumbnail_metadata", "message_row_id = ?", "deleteMmsThumbnailMetadataOlderThan/DELETE_MMS_THUMBNAIL_METADATA_BY_MESSAGE_ID", A1R);
                            B1k.A00();
                            C36321k7.A1T("MmsThumbnailMetadataDeletionManager/deleteMmsThumbnail deleting rows:", AnonymousClass000.A0u(), A032);
                            B1k.close();
                            A05.close();
                            return;
                        } catch (Throwable th) {
                            A05.close();
                            throw th;
                        }
                    } catch (Exception e2) {
                        Log.e("MmsThumbnailMetadataDeletionManager/deleteMmsThumbnail", e2);
                        return;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                } else {
                    return;
                }
                break;
        }
        throw th;
    }

    public AnonymousClass4KQ(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }
}
