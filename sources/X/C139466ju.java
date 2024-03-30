package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6ju  reason: invalid class name and case insensitive filesystem */
public final class C139466ju implements ARModelMetadataDownloader {
    public final AnonymousClass6K0 A00;
    public final AnonymousClass6PQ A01;
    public final C116505kh A02;
    public final AnonymousClass5ZV A03;

    public void downloadModelMetadata(List list, AnonymousClass6SG r17, AnonymousClass7eY r18) {
        String str;
        List list2 = list;
        AnonymousClass00C.A0D(list2, 0);
        AnonymousClass6SG r6 = r17;
        AnonymousClass7eY r10 = r18;
        C36321k7.A0x(r6, r10);
        AnonymousClass7U0 r13 = new AnonymousClass7U0(r10, list2);
        ArrayList A0J = C36321k7.A0J(list2);
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it.next();
            Object obj = ((C20070wy) C36381kD.A0p(C114005gU.A01)).get(aRModelMetadataRequest.mCapability);
            if (obj != null) {
                str = String.valueOf(obj);
            } else {
                str = null;
            }
            AnonymousClass6PQ r1 = this.A01;
            if (!AnonymousClass6PQ.A00(r6, r1)) {
                C101254xF r7 = r1.A02;
                String str2 = r6.A01;
                AnonymousClass00C.A08(str2);
                int A0L = AnonymousClass000.A0L(aRModelMetadataRequest.mCapability.name(), C90474aD.A1a(str2));
                r7.A02(A0L, "model_cache_metadata_download_start");
                r7.A03(A0L, "is_model_metadata_downloader_nmlml", String.valueOf(true));
            }
            A0J.add(new AnonymousClass69Z(aRModelMetadataRequest.mCapability.name(), str));
        }
        AnonymousClass6K0 r2 = this.A00;
        C146026uu B3y = r2.A01.B3y(new C147536xN(r2, A0J));
        if (!this.A02.A00.A09()) {
            C1263463o r12 = new C1263463o();
            r12.A00 = C108395Ti.DEVICE_OFFLINE;
            r10.BU6(r12.A00(), list2, (Map) null);
            return;
        }
        B3y.Blp(new C165527tZ(r10, this, list2, r13, 0));
    }

    public static final AnonymousClass5VK A00(Throwable th) {
        C1263463o r1 = new C1263463o();
        r1.A00 = C108395Ti.MODEL_METADATA_DOWNLOAD_FAILURE;
        r1.A03 = th;
        return r1.A00();
    }

    public C139466ju(AnonymousClass6K0 r1, AnonymousClass6PQ r2, C116505kh r3, AnonymousClass5ZV r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }
}
