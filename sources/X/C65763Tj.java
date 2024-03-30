package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Tj  reason: invalid class name and case insensitive filesystem */
public class C65763Tj {
    public static final List A04 = AnonymousClass001.A0I();
    public final List A00 = AnonymousClass001.A0I();
    public final List A01 = AnonymousClass001.A0I();
    public final List A02 = AnonymousClass001.A0I();
    public final List A03 = AnonymousClass001.A0I();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.4uL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f3, code lost:
        if (r5 != 101) goto L_0x00f5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C604037s A00(X.C203399nx r9) {
        /*
            r8 = this;
            java.lang.String r5 = "snapshot"
            X.9nx r3 = r9.A0c(r5)
            java.lang.String r0 = "patches"
            X.9nx r2 = r9.A0c(r0)
            if (r3 != 0) goto L_0x0011
            r1 = 0
            if (r2 == 0) goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            java.lang.String r0 = "SyncResponse/parseCollectionWithPatches both snapshot and patches node is null"
            X.C18740tg.A0E(r1, r0)
            r4 = 0
            if (r3 == 0) goto L_0x005b
            X.9nx r0 = r9.A0c(r5)
            X.C18740tg.A06(r0)
            byte[] r1 = r0.A01
            if (r1 == 0) goto L_0x004a
            int r0 = r1.length
            if (r0 == 0) goto L_0x004a
            X.4uL r0 = X.C100024uL.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0032 }
            X.8Hz r0 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 -> 0x0032 }
            X.4uL r0 = (X.C100024uL) r0     // Catch:{ 186 -> 0x0032 }
            r4 = r0
            goto L_0x005b
        L_0x0032:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sync-response/parseCollectionWithSnapshot failed to parse patch data in "
            X.C36321k7.A1M(r9, r0, r1, r2)
            r2 = 69
            java.lang.String r0 = "name"
            java.lang.String r1 = r9.A0i(r0, r4)
            X.198 r0 = new X.198
            r0.<init>(r2, r1)
            throw r0
        L_0x004a:
            r2 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)
            java.lang.String r0 = " body was empty."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            X.54p r0 = new X.54p
            r0.<init>(r2, r1)
            throw r0
        L_0x005b:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            if (r2 == 0) goto L_0x0146
            java.lang.String r5 = "patch"
            java.util.List r0 = r2.A0j(r5)
            java.util.Iterator r2 = r0.iterator()
        L_0x006b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00af
            X.9nx r0 = X.C36431kI.A0s(r2)
            byte[] r1 = r0.A01
            if (r1 == 0) goto L_0x009e
            int r0 = r1.length
            if (r0 == 0) goto L_0x009e
            X.8Ro r0 = X.C173408Ro.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0086 }
            X.8Hz r0 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 -> 0x0086 }
            r3.add(r0)     // Catch:{ 186 -> 0x0086 }
            goto L_0x006b
        L_0x0086:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sync-response/parseCollectionWithPatches failed to parse patch data in "
            X.C36321k7.A1M(r9, r0, r1, r2)
            r2 = 18
            java.lang.String r0 = "name"
            java.lang.String r1 = X.C36391kE.A0x(r9, r0)
            X.198 r0 = new X.198
            r0.<init>(r2, r1)
            throw r0
        L_0x009e:
            r2 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)
            java.lang.String r0 = " body was empty."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            X.54p r0 = new X.54p
            r0.<init>(r2, r1)
            throw r0
        L_0x00af:
            java.lang.String r0 = "name"
            java.lang.String r2 = X.C36391kE.A0x(r9, r0)
            int r0 = r3.size()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r0)
            java.util.Iterator r7 = r3.iterator()
        L_0x00c2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0146
            java.lang.Object r6 = r7.next()
            X.8Ro r6 = (X.C173408Ro) r6
            int r1 = r6.bitField0_
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0100
            X.8PK r0 = r6.exitCode_
            r1 = r0
            if (r0 != 0) goto L_0x00db
            X.8PK r0 = X.AnonymousClass8PK.DEFAULT_INSTANCE
        L_0x00db:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00f5
            if (r1 != 0) goto L_0x00e5
            X.8PK r1 = X.AnonymousClass8PK.DEFAULT_INSTANCE
        L_0x00e5:
            long r5 = r1.code_
            r3 = 100
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00fd
            r3 = 101(0x65, double:5.0E-322)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r1 = 37
            if (r0 == 0) goto L_0x00f7
        L_0x00f5:
            r1 = 38
        L_0x00f7:
            X.198 r0 = new X.198
            r0.<init>(r1, r2)
            throw r0
        L_0x00fd:
            r1 = 36
            goto L_0x00f7
        L_0x0100:
            r0 = r1 & 1
            if (r0 == 0) goto L_0x013e
            X.8O3 r0 = r6.version_
            if (r0 != 0) goto L_0x010a
            X.8O3 r0 = X.AnonymousClass8O3.DEFAULT_INSTANCE
        L_0x010a:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x013e
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0124
            X.B6c r0 = r6.mutations_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0124
            r1 = 14
            X.198 r0 = new X.198
            r0.<init>(r1, r2)
            throw r0
        L_0x0124:
            X.8O3 r0 = r6.version_
            if (r0 != 0) goto L_0x012a
            X.8O3 r0 = X.AnonymousClass8O3.DEFAULT_INSTANCE
        L_0x012a:
            long r0 = r0.version_
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.add(r0)
            if (r0 != 0) goto L_0x00c2
            r1 = 9
            X.198 r0 = new X.198
            r0.<init>(r1, r2)
            throw r0
        L_0x013e:
            r1 = 8
            X.198 r0 = new X.198
            r0.<init>(r1, r2)
            throw r0
        L_0x0146:
            java.lang.String r0 = "has_more_patches"
            java.lang.String r1 = X.C36391kE.A0x(r9, r0)
            java.lang.String r0 = "true"
            boolean r2 = r0.equals(r1)
            java.lang.String r1 = r8.A01(r9)
            X.37s r0 = new X.37s
            r0.<init>(r4, r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65763Tj.A00(X.9nx):X.37s");
    }

    private String A01(C203399nx r4) {
        String A0x = C36391kE.A0x(r4, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (A0x != null) {
            return A0x;
        }
        throw new C1032654p(true, AnonymousClass000.A0l(r4, "Expected attribute name in ", AnonymousClass000.A0u()));
    }

    public C65763Tj(C203399nx r10) {
        List list;
        Object obj;
        List list2;
        Object A012;
        C203399nx[] r0;
        C604037s r5;
        C203399nx A0c;
        C203399nx[] r02;
        C203399nx A0c2 = r10.A0c("sync");
        if (A0c2 != null) {
            Iterator it = A0c2.A0j("collection").iterator();
            while (it.hasNext()) {
                C203399nx A0s = C36431kI.A0s(it);
                if ("error".equals(A0s.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
                    C203399nx A0c3 = A0s.A0c("error");
                    C18740tg.A06(A0c3);
                    try {
                        int A0S = A0c3.A0S("code", -1);
                        String A0i = A0c3.A0i("text", (String) null);
                        if (A0S != 409 || (A0c = A0s.A0c("patches")) == null || (r02 = A0c.A02) == null || r02.length <= 0) {
                            r5 = new C604037s((C100024uL) null, A01(A0s), A04, "true".equals(A0s.A0i("has_more_patches", (String) null)));
                        } else {
                            r5 = A00(A0s);
                        }
                        list = this.A01;
                        obj = new AnonymousClass3E1(r5, A0i, A01(A0s), A0S);
                    } catch (C235919b e) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Expected attribute code in ");
                        A0u.append(A0c3);
                        throw new C1032654p(true, C36331k8.A0i(" exception", A0u, e));
                    }
                } else if (A0s.A0i("version", (String) null) != null) {
                    try {
                        long A0V = A0s.A0V("version", -1);
                        if (A0V != -1) {
                            list = this.A03;
                            obj = new AnonymousClass348(A0V, A01(A0s));
                        } else {
                            throw new C1032654p(true, AnonymousClass000.A0l(A0s, "Expected attribute version in ", AnonymousClass000.A0u()));
                        }
                    } catch (C235919b e2) {
                        StringBuilder A0v = AnonymousClass000.A0v("Expected attribute version in ");
                        A0v.append(A0s);
                        throw new C1032654p(true, C36331k8.A0i(" exception", A0v, e2));
                    }
                } else {
                    C203399nx A0c4 = A0s.A0c("patches");
                    if ((A0c4 == null || (r0 = A0c4.A02) == null || r0.length <= 0) && A0s.A0c("snapshot") == null) {
                        list2 = this.A00;
                        A012 = A01(A0s);
                    } else {
                        list2 = this.A02;
                        A012 = A00(A0s);
                    }
                    list2.add(A012);
                }
                list.add(obj);
            }
            return;
        }
        throw new C1032654p(true, "Expected node sync in response, but not found");
    }

    public C65763Tj() {
    }
}
