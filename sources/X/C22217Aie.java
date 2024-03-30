package X;

import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.InitializationVector;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.stream.CipherBuilder;
import java.nio.ByteBuffer;

/* renamed from: X.Aie  reason: case insensitive filesystem */
public final class C22217Aie extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C197549bt $buffer;
    public final /* synthetic */ C202559mB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22217Aie(C202559mB r2, C197549bt r3) {
        super(0);
        this.this$0 = r2;
        this.$buffer = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        IllegalStateException th;
        try {
            AnonymousClass9UM r4 = this.this$0.A04;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Receiving message on service: ");
            int i = this.$buffer.A01;
            C188378zU r1 = C188378zU.REQUEST_ENCRYPTION;
            if (i != r1.value) {
                r1 = C188378zU.ENABLE_ENCRYPTION;
                if (i != r1.value) {
                    r1 = C188378zU.END_LINK_SETUP;
                    if (i != r1.value) {
                        throw C90464aC.A0R("Unknown message type: ", AnonymousClass000.A0u(), i);
                    }
                }
            }
            r4.A01(new AnonymousClass9PM(AnonymousClass000.A0o(r1, A0u)));
        } catch (IllegalStateException unused) {
        }
        C197549bt r12 = this.$buffer;
        AnonymousClass00C.A0D(r12, 0);
        ByteBuffer byteBuffer = r12.A00;
        if (byteBuffer != null) {
            C187418xq r3 = new C187418xq(byteBuffer);
            if (r12.A01 == C188378zU.ENABLE_ENCRYPTION.value) {
                C170918Hz A05 = C170918Hz.A05(new AnonymousClass8I9(r3), C201979ko.A00(), C173248Qy.DEFAULT_INSTANCE);
                C170918Hz.A0W(A05);
                C173248Qy r8 = (C173248Qy) A05;
                AnonymousClass00C.A08(r8);
                C202559mB r5 = this.this$0;
                synchronized (r5.A0B) {
                    CipherBuilder cipherBuilder = r5.A01;
                    if (cipherBuilder == null) {
                        C22313Akb akb = new C22313Akb(r5);
                        cipherBuilder = new CipherBuilder();
                        akb.invoke(cipherBuilder);
                    }
                    C1896894u r0 = PublicKey.Companion;
                    byte[] A0i = C165617ti.A0i(r8.publicKey_);
                    PublicKey publicKey = new PublicKey((HybridData) null);
                    publicKey.setRaw(A0i);
                    cipherBuilder.setRemotePublicKey(publicKey);
                    C1896694s r02 = InitializationVector.Companion;
                    byte[] A0i2 = C165617ti.A0i(r8.iv_);
                    InitializationVector initializationVector = new InitializationVector();
                    initializationVector.setRaw(A0i2);
                    cipherBuilder.setInitializationVector(initializationVector);
                    cipherBuilder.setSeed(C165617ti.A0i(r8.seed_));
                    boolean z = true;
                    if ((r8.parameters_ & 1) != 1) {
                        z = false;
                    }
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("----------------------------------------------");
                    A0u2.append(10);
                    StringBuilder A0l = C165587tf.A0l("Enable decryption:", A0u2);
                    A0l.append("base: ");
                    A0l.append(String.valueOf(C165597tg.A0C(r8.base_)));
                    C36351kA.A1K(A0l, A0u2);
                    StringBuilder A0y = C165607th.A0y(A0u2);
                    A0y.append("seed: ");
                    byte[] bArr = cipherBuilder.seed;
                    C22507Anp anp = C22507Anp.A00;
                    C165567td.A1T(A0y, A0u2, anp, bArr);
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("initialization vector: ");
                    C165567td.A1T(A0u3, A0u2, anp, cipherBuilder.initializationVector.toByteArray());
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    A0u4.append("challenge: ");
                    C165567td.A1T(A0u4, A0u2, anp, cipherBuilder.challenge);
                    StringBuilder A0l2 = C165587tf.A0l(C36371kC.A0z("hkdf: ", AnonymousClass000.A0u(), z), A0u2);
                    A0l2.append("public key: ");
                    PublicKey publicKey2 = cipherBuilder.remotePublicKey;
                    if (publicKey2 != null) {
                        C165567td.A1T(A0l2, A0u2, anp, publicKey2.serialize());
                        StringBuilder A0u5 = AnonymousClass000.A0u();
                        A0u5.append("RX generated challenge: ");
                        C165567td.A1T(A0u5, A0u2, anp, cipherBuilder.buildRxChallenge().toByteArray());
                        AnonymousClass6YR.A04("LinkSetup", C36381kD.A0y(A0u2));
                        C21009A2x a2x = new C21009A2x(cipherBuilder.buildDecryptionFraming(r8.base_, z));
                        r5.A09.interruptWithError(AnonymousClass9AK.A01);
                        C202079l0 r03 = r5.A05;
                        synchronized (r03.A08) {
                            try {
                                AnonymousClass9JX r04 = r03.A00;
                                if (r04 != null) {
                                    r04.A00 = a2x;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        C202559mB.A02(r5, new C22308AkW(a2x));
                        C202559mB.A01(r5, new C22309AkX(cipherBuilder));
                    } else {
                        th = C36381kD.A0l();
                        throw th;
                    }
                }
                return AnonymousClass0AJ.A00;
            }
            throw C90524aI.A0X("Unsupported message type");
        }
        throw C90524aI.A0X("buffer is disposed");
    }
}
