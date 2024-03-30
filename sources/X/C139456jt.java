package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6jt  reason: invalid class name and case insensitive filesystem */
public class C139456jt implements AnonymousClass7eY {
    public final /* synthetic */ AnonymousClass63F A00;
    public final /* synthetic */ AnonymousClass60A A01;
    public final /* synthetic */ C132216Sr A02;
    public final /* synthetic */ AnonymousClass7eX A03;
    public final /* synthetic */ AnonymousClass6SG A04;
    public final /* synthetic */ AtomicReference A05;
    public final /* synthetic */ AtomicReference A06;

    public C139456jt(AnonymousClass63F r1, AnonymousClass60A r2, C132216Sr r3, AnonymousClass7eX r4, AnonymousClass6SG r5, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.A02 = r3;
        this.A05 = atomicReference;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A06 = atomicReference2;
        this.A00 = r1;
    }

    public void BU6(Exception exc, List list, Map map) {
        AnonymousClass5VK r0;
        AtomicReference atomicReference = this.A05;
        if (atomicReference.get() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass6PQ r3 = this.A02.A02;
                AnonymousClass6SG r2 = this.A04;
                C1263463o r1 = new C1263463o();
                r1.A00 = C108395Ti.METADATA_FETCH_FAILED;
                r1.A01 = "cancel due to other metadata requests failed";
                r3.A01((ARModelMetadataRequest) it.next(), r1.A00(), r2, false);
            }
        }
        Exception exc2 = exc;
        if (exc == null || !atomicReference.compareAndSet((Object) null, exc2)) {
            CountDownLatch countDownLatch = new CountDownLatch(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it2.next();
                List<C135056c3> A0o = C90524aI.A0o(aRModelMetadataRequest.mCapability, map);
                if (A0o == null || A0o.isEmpty()) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("metadata is missing from result. capability: %s version %d", aRModelMetadataRequest.mCapability, Integer.valueOf(aRModelMetadataRequest.mPreferredVersion));
                    C1263463o r12 = new C1263463o();
                    r12.A00 = C108395Ti.MODEL_METADATA_DOWNLOAD_FAILURE;
                    r12.A01 = formatStrLocaleSafe;
                    AnonymousClass5VK A002 = r12.A00();
                    this.A02.A02.A01(aRModelMetadataRequest, A002, this.A04, false);
                    this.A03.BTz((AnonymousClass60A) null, A002);
                    return;
                }
                C132216Sr r4 = this.A02;
                int size = list.size();
                AnonymousClass6SG r32 = this.A04;
                AnonymousClass60A r17 = this.A01;
                AtomicReference atomicReference2 = this.A06;
                AnonymousClass63F r11 = this.A00;
                AnonymousClass62V r22 = new AnonymousClass62V(aRModelMetadataRequest, this, countDownLatch);
                if (!r4.A03.containsKey(aRModelMetadataRequest.mCapability)) {
                    C1263463o r33 = new C1263463o();
                    r33.A00 = C108395Ti.METADATA_FETCH_FAILED;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Requested fetching unsupported capability: ");
                    r33.A01 = AnonymousClass000.A0o(aRModelMetadataRequest.mCapability, A0u);
                    r0 = r33.A00();
                } else {
                    ArrayList A0I = AnonymousClass001.A0I();
                    int A022 = ((C135056c3) A0o.get(0)).A01.A02();
                    for (C135056c3 r15 : A0o) {
                        try {
                            if (!C132216Sr.A01(r15, aRModelMetadataRequest.mCapability, r4)) {
                                A0I.add(r15);
                            }
                        } catch (AnonymousClass5VD e) {
                            C1263463o r13 = new C1263463o();
                            r13.A00 = C108395Ti.MODEL_FETCH_FAILURE;
                            r13.A03 = e;
                            r22.A00(r13.A00());
                        }
                    }
                    if (A0I.size() == 0) {
                        C132216Sr.A00(r17, aRModelMetadataRequest.mCapability, r4, A022);
                        if (r11 != null) {
                            Objects.requireNonNull(atomicReference2);
                            atomicReference2.set(Double.valueOf(C90494aF.A00(atomicReference2) + (1.0d / ((double) size))));
                            Objects.requireNonNull(atomicReference2);
                            r11.A00(C90494aF.A00(atomicReference2));
                        }
                        r4.A02.A02(aRModelMetadataRequest, r32, A022, true);
                        r0 = null;
                    } else {
                        r4.A02.A02(aRModelMetadataRequest, r32, A022, false);
                        C97844qM r19 = new C97844qM(r11, r4, atomicReference2, new AtomicReference(C90494aF.A0S()), size);
                        r4.A00.A09(r19, new C139396jl(aRModelMetadataRequest, r17, r22, r4, A0o), new AnonymousClass5YD(), r32, A0I);
                    }
                }
                r22.A00(r0);
            }
            try {
                countDownLatch.await();
                if (atomicReference.get() != null) {
                    this.A03.BTz((AnonymousClass60A) null, (Exception) atomicReference.get());
                } else {
                    this.A03.BTz(this.A01, (Exception) null);
                }
            } catch (InterruptedException e2) {
                C1263463o r14 = new C1263463o();
                r14.A00 = C108395Ti.MODEL_FETCH_FAILURE;
                r14.A03 = e2;
                this.A03.BTz((AnonymousClass60A) null, r14.A00());
            }
        } else {
            C1263463o r16 = new C1263463o();
            r16.A00 = C108395Ti.MODEL_METADATA_DOWNLOAD_FAILURE;
            r16.A03 = exc2;
            AnonymousClass5VK A003 = r16.A00();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                this.A02.A02.A01((ARModelMetadataRequest) it3.next(), A003, this.A04, false);
            }
            this.A03.BTz((AnonymousClass60A) null, A003);
        }
    }
}
