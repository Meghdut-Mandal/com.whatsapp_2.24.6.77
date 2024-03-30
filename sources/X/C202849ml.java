package X;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9ml  reason: invalid class name and case insensitive filesystem */
public abstract class C202849ml {
    public static final Map A00;
    public static final C22648AsE A01 = C22590ArI.A00;

    public static void A02(String str, StringBuffer stringBuffer, byte[] bArr) {
        byte[] A03;
        int length = bArr.length;
        stringBuffer.append("            Signature: ");
        if (length > 20) {
            stringBuffer.append(C202439lp.A00(bArr, 20));
            stringBuffer.append(str);
            int i = 20;
            do {
                int i2 = length - 20;
                stringBuffer.append("                       ");
                if (i < i2) {
                    A03 = C202439lp.A03(bArr, i, 20);
                } else {
                    A03 = C202439lp.A03(bArr, i, length - i);
                }
                stringBuffer.append(AnonymousClass11q.A02(A03));
                stringBuffer.append(str);
                i += 20;
            } while (i < length);
            return;
        }
        stringBuffer.append(C202439lp.A00(bArr, length));
        stringBuffer.append(str);
    }

    public static String A00(AnonymousClass122 r4) {
        String A1A = C36431kI.A1A(r4, AnonymousClass9A2.A00);
        if (A1A == null) {
            A1A = r4.A01;
        }
        int indexOf = A1A.indexOf(45);
        if (indexOf <= 0 || A1A.startsWith("SHA3")) {
            return A1A;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C165577te.A1O(A1A, A0u, 0, indexOf);
        return AnonymousClass000.A0q(C165607th.A0o(indexOf, A1A), A0u);
    }

    public static String A01(C22632Ary ary) {
        C22648AsE asE;
        StringBuilder A0u;
        String str;
        C22626Ars ars;
        C219411z r2 = ary.A00;
        if (!(r2 == null || (asE = A01) == r2 || asE.A0F(r2.Bve()))) {
            AnonymousClass122 r1 = ary.A01;
            if (r1.A0G(C219311y.A0I)) {
                C22632Ary ary2 = C22626Ars.A06;
                if (r2 instanceof C22626Ars) {
                    ars = (C22626Ars) r2;
                } else {
                    ars = new C22626Ars(C22656AsM.A04(r2));
                }
                A0u = AnonymousClass000.A0u();
                A0u.append(A00(ars.A00.A01));
                str = "withRSAandMGF1";
            } else if (r1.A0G(B4T.A0Y)) {
                C22656AsM A04 = C22656AsM.A04(r2);
                A0u = AnonymousClass000.A0u();
                A0u.append(A00((AnonymousClass122) C22656AsM.A02(A04)));
                str = "withECDSA";
            }
            return AnonymousClass000.A0q(str, A0u);
        }
        Map map = A00;
        AnonymousClass122 r6 = ary.A01;
        String A1A = C36431kI.A1A(r6, map);
        if (A1A != null) {
            return A1A;
        }
        Provider provider = Security.getProvider("SC");
        if (provider != null) {
            String property = provider.getProperty(AnonymousClass000.A0l(r6, "Alg.Alias.Signature.", AnonymousClass000.A0u()));
            if (property != null) {
                return property;
            }
            String property2 = provider.getProperty(AnonymousClass000.A0l(r6, "Alg.Alias.Signature.OID.", AnonymousClass000.A0u()));
            if (property2 != null) {
                return property2;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            if (provider != providers[i]) {
                Provider provider2 = providers[i];
                String property3 = provider2.getProperty(AnonymousClass000.A0l(r6, "Alg.Alias.Signature.", AnonymousClass000.A0u()));
                if (property3 != null) {
                    return property3;
                }
                String property4 = provider2.getProperty(AnonymousClass000.A0l(r6, "Alg.Alias.Signature.OID.", AnonymousClass000.A0u()));
                if (property4 != null) {
                    return property4;
                }
            }
        }
        return r6.A01;
    }

    public static void A03(Signature signature, C219411z r4) {
        C22648AsE asE;
        if (r4 != null && (asE = A01) != r4 && !asE.A0F(r4.Bve())) {
            AlgorithmParameters instance = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                instance.init(r4.Bve().A08());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(instance.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e) {
                        throw new SignatureException(C36331k8.A0i("Exception extracting parameters: ", AnonymousClass000.A0u(), e));
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException(C36331k8.A0i("IOException decoding parameters: ", AnonymousClass000.A0u(), e2));
            }
        }
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A00 = A0J;
        A0J.put(B4D.A00, "Ed25519");
        A0J.put(B4D.A01, "Ed448");
        A0J.put(AnonymousClass128.A05, "SHA1withDSA");
        A0J.put(B4T.A0g, "SHA1withDSA");
    }
}
