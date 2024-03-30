package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.security.Signature;
import com.facebook.wearable.datax.RemoteChannel;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.95z  reason: invalid class name and case insensitive filesystem */
public class C1898895z extends C03030Cw implements C009003v {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1898895z(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0036;
                case 1: goto L_0x002e;
                case 2: goto L_0x0026;
                case 3: goto L_0x001e;
                case 4: goto L_0x001b;
                case 5: goto L_0x0013;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.9Qi> r3 = X.C194589Qi.class
            r1 = 2
            java.lang.String r4 = "fromTreeNode"
            java.lang.String r5 = "fromTreeNode(Lcom/whatsapp/group/batch/iq/BatchGetGroupInfoRequest;Lcom/whatsapp/protocol/ProtocolTreeNode;)Lcom/whatsapp/group/batch/iq/BatchGetGroupInfoResponse;"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.9Sn> r3 = X.C195109Sn.class
            r1 = 2
            java.lang.String r4 = "handleMessage"
            java.lang.String r5 = "handleMessage(Lcom/facebook/wearable/datax/RemoteChannel;Lcom/facebook/wearable/datax/TypedBuffer;)V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.AVZ> r3 = X.AVZ.class
            goto L_0x0020
        L_0x001e:
            java.lang.Class<X.9oX> r3 = X.C203689oX.class
        L_0x0020:
            r1 = 2
            java.lang.String r4 = "handleLinkFailure"
            java.lang.String r5 = "handleLinkFailure(Ljava/util/UUID;Lcom/facebook/wearable/datax/ProtocolException;)V"
            goto L_0x000d
        L_0x0026:
            java.lang.Class<X.9gt> r3 = X.C200219gt.class
            r1 = 2
            java.lang.String r4 = "handleMediaStreamErrorEvent"
            java.lang.String r5 = "handleMediaStreamErrorEvent$fbandroid_java_com_facebook_wearable_mediastream_controller_wa_controller_mbed(Lcom/facebook/wearable/mediastream/api/errors/MediaStreamErrorEvent;Lcom/facebook/wearable/mediastream/api/errors/DebugInfo;)V"
            goto L_0x000d
        L_0x002e:
            java.lang.Class<X.8AA> r3 = X.AnonymousClass8AA.class
            r1 = 2
            java.lang.String r4 = "handleOnLinkFailure"
            java.lang.String r5 = "handleOnLinkFailure(Ljava/util/UUID;Lcom/facebook/wearable/datax/ProtocolException;)V"
            goto L_0x000d
        L_0x0036:
            java.lang.Class<X.9mB> r3 = X.C202559mB.class
            r1 = 2
            java.lang.String r4 = "parseServiceMessage"
            java.lang.String r5 = "parseServiceMessage(Lcom/facebook/wearable/datax/RemoteChannel;Lcom/facebook/wearable/datax/TypedBuffer;)V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1898895z.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass88H r0;
        switch (this.A00) {
            case 0:
                RemoteChannel remoteChannel = (RemoteChannel) obj;
                C197549bt r10 = (C197549bt) obj2;
                C36321k7.A0w(remoteChannel, r10);
                C202559mB r1 = (C202559mB) this.receiver;
                C202559mB.A00(r1, new C22248Aj9(r1, remoteChannel, r10));
                break;
            case 1:
                C36321k7.A0w(obj, obj2);
                AnonymousClass9AO.A01.A06("sup:SocketConnectionStateDelegate", "[SOCKET_CONNECTION] LinkedDevice onLinkFailure", (Throwable) null);
                break;
            case 2:
                C194269Ow r9 = (C194269Ow) obj;
                ((C200219gt) C90514aH.A0q(r9, this)).A09((AnonymousClass88E) obj2, r9);
                break;
            case 3:
                C36321k7.A0w(obj, obj2);
                break;
            case 4:
                Throwable th = (Throwable) obj2;
                C36321k7.A0w(obj, th);
                AnonymousClass6YR.A0A("lam:LinkedDeviceManager", AnonymousClass000.A0l(obj, "handleLinkFailure serviceUuid=", AnonymousClass000.A0u()), th);
                ((AVZ) this.receiver).A01.A08.invoke(obj, th);
                break;
            case 5:
                RemoteChannel remoteChannel2 = (RemoteChannel) obj;
                C197549bt r102 = (C197549bt) obj2;
                C36331k8.A1I(remoteChannel2, r102);
                C195109Sn r2 = (C195109Sn) this.receiver;
                ByteBuffer byteBuffer = r102.A00;
                if (byteBuffer != null) {
                    int i = r102.A01;
                    if (i != AnonymousClass910.ENABLE_TRUST.BEY()) {
                        AnonymousClass6YR.A0B("lam:LinkAuthentication", AnonymousClass000.A0r("Unknown message type ", AnonymousClass000.A0u(), i), (Throwable) null);
                        break;
                    } else {
                        C172578Oj r6 = (C172578Oj) C170918Hz.A07(C172578Oj.DEFAULT_INSTANCE, byteBuffer);
                        C1896594r r02 = Hash.Companion;
                        PublicKey publicKey = r2.A03;
                        byte[] serialize = publicKey.serialize();
                        AnonymousClass00C.A0D(serialize, 0);
                        Hash hash = new Hash((HybridData) null);
                        hash.hashBytes(serialize);
                        byte[] A0i = C165617ti.A0i(r6.identifier_);
                        Hash hash2 = new Hash((HybridData) null);
                        hash2.setRaw(A0i);
                        if (hash.equals(hash2)) {
                            C1897094w r03 = Signature.Companion;
                            byte[] A0i2 = C165617ti.A0i(r6.signature_);
                            Signature signature = new Signature((HybridData) null);
                            signature.setRaw(A0i2);
                            if (publicKey.verifySignature(r2.A00, signature)) {
                                remoteChannel2.send(new AnonymousClass6P8(ZipDecompressor.UNZIP_BUFFER_SIZE));
                                new C22085AgW(r2).invoke();
                                if (r2.A08.get() && r2.A06.get()) {
                                    r2.A09.invoke();
                                    break;
                                }
                            } else {
                                AnonymousClass6YR.A09("lam:LinkAuthentication", "Enable trust failed, invalid signature", (Throwable) null);
                                r0 = AnonymousClass88H.A03;
                            }
                        } else {
                            AnonymousClass6YR.A09("lam:LinkAuthentication", "Enable trust failed, identity mismatch", (Throwable) null);
                            r0 = AnonymousClass88H.A02;
                        }
                        remoteChannel2.send(new AnonymousClass6P8(r0.A00));
                        break;
                    }
                }
                break;
            default:
                C21643ATj aTj = (C21643ATj) obj;
                C203399nx r103 = (C203399nx) obj2;
                C36321k7.A0w(aTj, r103);
                C194589Qi r04 = (C194589Qi) this.receiver;
                AnonymousClass9KE r4 = new AnonymousClass9KE(r04.A00, r04.A01);
                C185938v9 r5 = (C185938v9) aTj.A03.getValue();
                ArrayList A0I = AnonymousClass001.A0I();
                try {
                    C186258vf r05 = new C186258vf(r103, r5);
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    LinkedHashMap A1G = C36431kI.A1G();
                    Iterator A14 = C90514aH.A14((List) r05.A01);
                    while (A14.hasNext()) {
                        ((C23008Azy) ((C184818t3) A14.next()).A01).Azv(new AnonymousClass9KD(r4, A0I2, A1G));
                    }
                    C199819g4 r22 = new C199819g4(C007103b.A0Y(A0I2), C000400e.A0B(A1G));
                    r4.A00 = r22;
                    return r22;
                } catch (C235919b e) {
                    C165567td.A1R("BatchGetGroupInfoResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
                    try {
                        C185288tu r23 = (C185288tu) new C186278vh(r103, r5).A00;
                        AnonymousClass00C.A08(r23);
                        C199819g4 r24 = new C199819g4(String.valueOf(r23.B9o().longValue()), r23.BIF());
                        r4.A00 = r24;
                        return r24;
                    } catch (C235919b e2) {
                        C165567td.A1R("BatchGetGroupInfoResponseClientError: ", AnonymousClass000.A0u(), e2, A0I);
                        try {
                            C23047B1s b1s = (C23047B1s) ((C184818t3) new C186268vg(r103, r5).A00).A00;
                            AnonymousClass00C.A08(b1s);
                            C199819g4 r25 = new C199819g4(String.valueOf(b1s.B9o().longValue()), b1s.BIF());
                            r4.A00 = r25;
                            return r25;
                        } catch (C235919b e3) {
                            throw C165567td.A0H("BatchGetGroupInfoResponseServerError: ", AnonymousClass000.A0u(), e3, A0I);
                        }
                    }
                }
        }
        return AnonymousClass0AJ.A00;
    }
}
