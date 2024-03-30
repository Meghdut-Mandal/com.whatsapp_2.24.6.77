package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.8Hz  reason: invalid class name and case insensitive filesystem */
public abstract class C170918Hz extends C21070A7h {
    public static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    public static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map defaultInstanceMap = C90524aI.A0s();
    public int memoizedSerializedSize = -1;
    public C202229lJ unknownFields = C202229lJ.A04;

    public static C170918Hz A08(C170918Hz r8, byte[] bArr) {
        AnonymousClass186 e;
        byte[] bArr2 = bArr;
        int length = bArr.length;
        C201979ko A00 = C201979ko.A00();
        C170918Hz r4 = (C170918Hz) A0S(r8, C023109s.A0G);
        try {
            C23073B3d A0O = C165577te.A0O(r4);
            A0O.BPo(new C197909ca(A00), r4, bArr2, 0, length);
            A0O.BP1(r4);
            A0W(r4);
            return r4;
        } catch (AnonymousClass186 e2) {
            e = e2;
            if (e.wasThrownFromInputStream) {
                e = new AnonymousClass186((IOException) e);
            }
            e.unfinishedMessage = r4;
            throw e;
        } catch (C21827Ab3 e3) {
            e = C165617ti.A0L(e3.getMessage());
            e.unfinishedMessage = r4;
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof AnonymousClass186) {
                throw e4.getCause();
            }
            e = new AnonymousClass186(e4);
            e.unfinishedMessage = r4;
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = C165587tf.A0J();
            e.unfinishedMessage = r4;
            throw e;
        }
    }

    public static Object A0S(C170918Hz r1, Integer num) {
        return r1.A0r(num, (Object) null, (Object) null);
    }

    public static void A0Y(Object[] objArr) {
        objArr[1] = "url_";
        objArr[2] = "fileSha256_";
        objArr[3] = "fileEncSha256_";
        objArr[4] = "mediaKey_";
        objArr[5] = "mimetype_";
        objArr[6] = "height_";
        objArr[7] = "width_";
        objArr[8] = "directPath_";
        objArr[9] = "fileLength_";
    }

    public static void A0Z(Object[] objArr, Object obj) {
        objArr[1] = obj;
        objArr[2] = "bitField0_";
    }

    public static void A0a(Object[] objArr, Object obj) {
        objArr[1] = obj;
        objArr[2] = "encPayload_";
        objArr[3] = "encIv_";
    }

    public static Object[] A0c() {
        Object[] objArr = new Object[2];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A0d() {
        Object[] objArr = new Object[3];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A0e() {
        Object[] objArr = new Object[4];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A0f() {
        Object[] objArr = new Object[5];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static Object[] A0g() {
        Object[] objArr = new Object[6];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static int A00(AnonymousClass8SU r0) {
        return r0.messageStubParameters_.size();
    }

    public static AnonymousClass8NN A02(AnonymousClass8NL r0) {
        AnonymousClass8SV r02 = ((AnonymousClass8SX) r0.A00).interactiveMessage_;
        if (r02 == null) {
            r02 = AnonymousClass8SV.DEFAULT_INSTANCE;
        }
        return r02.A0q();
    }

    public static AnonymousClass8NN A03(C202719mV r0) {
        AnonymousClass8NN A0q = r0.A00.A0q();
        A0q.A0S();
        return A0q;
    }

    public static C170918Hz A05(C200279h2 r4, C201979ko r5, C170918Hz r6) {
        C170918Hz r3 = (C170918Hz) A0S(r6, C023109s.A0G);
        try {
            C23073B3d A0O = C165577te.A0O(r3);
            C203179nT r0 = r4.A01;
            if (r0 == null) {
                r0 = new C203179nT(r4);
            }
            A0O.BPn(r0, r5, r3);
            A0O.BP1(r3);
            return r3;
        } catch (AnonymousClass186 e) {
            e = e;
            if (e.wasThrownFromInputStream) {
                e = new AnonymousClass186((IOException) e);
            }
            e.unfinishedMessage = r3;
            throw e;
        } catch (C21827Ab3 e2) {
            AnonymousClass186 A0L = C165617ti.A0L(e2.getMessage());
            A0L.unfinishedMessage = r3;
            throw A0L;
        } catch (IOException e3) {
            if (e3.getCause() instanceof AnonymousClass186) {
                throw e3.getCause();
            }
            e = new AnonymousClass186(e3);
            e.unfinishedMessage = r3;
            throw e;
        } catch (RuntimeException e4) {
            e = e4;
            if (e.getCause() instanceof AnonymousClass186) {
                e = e.getCause();
            }
            throw e;
        }
    }

    public static AnonymousClass9LW A0B(B63 b63, String str, Object[] objArr) {
        return new AnonymousClass9LW(b63, str, objArr);
    }

    public static AnonymousClass8NL A0D() {
        return (AnonymousClass8NL) AnonymousClass8SX.DEFAULT_INSTANCE.A0p();
    }

    public static C172718Ox A0E(C173308Re r0, int i) {
        C172718Ox r02 = ((C173078Qh) r0.buttons_.get(i)).nativeFlowInfo_;
        if (r02 == null) {
            return C172718Ox.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static AnonymousClass8SN A0G(AnonymousClass8NN r0) {
        AnonymousClass8SN r02 = ((AnonymousClass8SV) r0.A00).header_;
        if (r02 == null) {
            return AnonymousClass8SN.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static AnonymousClass8NE A0J(AnonymousClass8NL r0) {
        AnonymousClass8SQ r02 = ((AnonymousClass8SX) r0.A00).protocolMessage_;
        if (r02 == null) {
            r02 = AnonymousClass8SQ.DEFAULT_INSTANCE;
        }
        return (AnonymousClass8NE) r02.A0q();
    }

    public static AnonymousClass91G A0K(AnonymousClass8SQ r0) {
        AnonymousClass91G A00 = AnonymousClass91G.A00(r0.type_);
        if (A00 == null) {
            return AnonymousClass91G.REVOKE;
        }
        return A00;
    }

    public static AnonymousClass8SQ A0L(AnonymousClass9YL r0) {
        AnonymousClass8SQ r02 = r0.A0A.protocolMessage_;
        if (r02 == null) {
            return AnonymousClass8SQ.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static AnonymousClass8N6 A0M(AnonymousClass8NL r0) {
        AnonymousClass8SL r02 = ((AnonymousClass8SX) r0.A00).templateMessage_;
        if (r02 == null) {
            r02 = AnonymousClass8SL.DEFAULT_INSTANCE;
        }
        return (AnonymousClass8N6) r02.A0q();
    }

    public static AnonymousClass8SO A0N(AnonymousClass8SL r0) {
        AnonymousClass8SO r02 = r0.hydratedTemplate_;
        if (r02 == null) {
            return AnonymousClass8SO.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static AnonymousClass8NH A0O(AnonymousClass8NL r0) {
        AnonymousClass8SE r02 = ((AnonymousClass8SX) r0.A00).videoMessage_;
        if (r02 == null) {
            r02 = AnonymousClass8SE.DEFAULT_INSTANCE;
        }
        return (AnonymousClass8NH) r02.A0q();
    }

    public static AnonymousClass8SX A0P(AnonymousClass8NN r0) {
        AnonymousClass8SX r02 = ((C172328Nk) r0.A00).message_;
        if (r02 == null) {
            return AnonymousClass8SX.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static Integer A0R(int i) {
        if (i == 0) {
            return C023109s.A0S;
        }
        if (i == 1) {
            return C023109s.A00;
        }
        if (i == 2) {
            return C023109s.A01;
        }
        if (i == 3) {
            return C023109s.A0C;
        }
        if (i == 4) {
            return C023109s.A0G;
        }
        if (i != 5) {
            return null;
        }
        return C023109s.A0R;
    }

    public static void A0U(C21674AUx aUx, AnonymousClass8NN r4, AnonymousClass3L1 r5) {
        AnonymousClass8SC r1 = (AnonymousClass8SC) r4.A00;
        r1.bitField0_ |= 16384;
        r1.thumbnailEncSha256_ = aUx;
        int i = r5.A01;
        if (i > 0 && r5.A00 > 0) {
            r4.A0S();
            AnonymousClass8SC r2 = (AnonymousClass8SC) r4.A00;
            r2.bitField0_ |= 262144;
            r2.thumbnailWidth_ = i;
            int i2 = r5.A00;
            r4.A0S();
            AnonymousClass8SC r22 = (AnonymousClass8SC) r4.A00;
            r22.bitField0_ |= C132986Wc.A0F;
            r22.thumbnailHeight_ = i2;
        }
    }

    public static void A0V(AnonymousClass8NN r0, AnonymousClass8NL r1, AnonymousClass8NF r2, AnonymousClass8SN r3, int i) {
        r3.mediaCase_ = i;
        r2.A0U((AnonymousClass8SN) r0.A0R());
        r1.A0a((AnonymousClass8SV) r2.A0R());
    }

    public static void A0W(C170918Hz r1) {
        if (r1 != null && !A0b(r1)) {
            AnonymousClass186 A0L = C165617ti.A0L(new C21827Ab3().getMessage());
            A0L.unfinishedMessage = r1;
            throw A0L;
        }
    }

    public static void A0X(C170918Hz r2, Class cls) {
        r2.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(cls, r2);
    }

    public static final boolean A0b(C170918Hz r4) {
        byte byteValue = ((Number) A0S(r4, C023109s.A00)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean BM3 = C165577te.A0O(r4).BM3(r4);
        Integer num = C023109s.A01;
        C170918Hz r1 = null;
        if (BM3) {
            r1 = r4;
        }
        r4.A0r(num, r1, (Object) null);
        return BM3;
    }

    public static Object[] A0h(int i) {
        Object[] objArr = new Object[i];
        objArr[0] = "nonce_";
        return objArr;
    }

    public final AnonymousClass8NN A0p() {
        return (AnonymousClass8NN) A0S(this, C023109s.A0R);
    }

    public final AnonymousClass8NN A0q() {
        AnonymousClass8NN r0 = (AnonymousClass8NN) A0S(this, C023109s.A0R);
        r0.A0T(this);
        return r0;
    }

    public boolean A0t() {
        return AnonymousClass000.A1P(this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public /* bridge */ /* synthetic */ C170918Hz BAu() {
        return (C170918Hz) A0S(this, C023109s.A0S);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C198739e7.A02.A00(cls).B6j(this, obj);
    }

    public static AnonymousClass8NN A01(C170918Hz r0) {
        AnonymousClass8NN A0p = r0.A0p();
        A0p.A0S();
        return A0p;
    }

    public static C170918Hz A04(C21674AUx aUx, C170918Hz r5) {
        C201979ko A00 = C201979ko.A00();
        AnonymousClass8I5 r4 = (AnonymousClass8I5) aUx;
        AnonymousClass8I7 A07 = C200279h2.A07(r4.bytes, r4.A07(), r4.A02());
        C170918Hz A05 = A05(A07, A00, r5);
        try {
            A07.A0R(0);
            A0W(A05);
            A0W(A05);
            return A05;
        } catch (AnonymousClass186 e) {
            e.unfinishedMessage = A05;
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r0 = X.C165587tf.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C170918Hz A06(X.C170918Hz r6, java.io.InputStream r7) {
        /*
            X.9ko r5 = X.C201979ko.A00()
            int r4 = r7.read()     // Catch:{ 186 -> 0x0064, IOException -> 0x005d }
            r3 = -1
            if (r4 != r3) goto L_0x000c
            goto L_0x0058
        L_0x000c:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            r4 = r4 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0013:
            int r1 = r7.read()     // Catch:{ 186 -> 0x0064, IOException -> 0x005d }
            if (r1 == r3) goto L_0x0040
            r0 = r1 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            int r2 = r2 + 7
            r0 = 32
            if (r2 >= r0) goto L_0x0028
            goto L_0x0013
        L_0x0028:
            r0 = 64
            if (r2 >= r0) goto L_0x0039
            int r0 = r7.read()     // Catch:{ 186 -> 0x0064, IOException -> 0x005d }
            if (r0 == r3) goto L_0x0040
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            int r2 = r2 + 7
            goto L_0x0028
        L_0x0039:
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.186 r0 = X.C165617ti.A0L(r0)     // Catch:{ 186 -> 0x0064, IOException -> 0x005d }
            goto L_0x0044
        L_0x0040:
            X.186 r0 = X.C165587tf.A0J()     // Catch:{ 186 -> 0x0064, IOException -> 0x005d }
        L_0x0044:
            throw r0     // Catch:{ 186 -> 0x0064, IOException -> 0x005d }
        L_0x0045:
            X.5Qs r0 = new X.5Qs
            r0.<init>(r7, r4)
            X.8I9 r1 = new X.8I9
            r1.<init>(r0)
            X.8Hz r2 = A05(r1, r5, r6)
            r0 = 0
            r1.A0R(r0)     // Catch:{ 186 -> 0x006f }
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            A0W(r2)
            return r2
        L_0x005d:
            r0 = move-exception
            X.186 r1 = new X.186
            r1.<init>((java.io.IOException) r0)
            throw r1
        L_0x0064:
            r1 = move-exception
            boolean r0 = r1.wasThrownFromInputStream
            if (r0 == 0) goto L_0x0072
            X.186 r0 = new X.186
            r0.<init>((java.io.IOException) r1)
            throw r0
        L_0x006f:
            r1 = move-exception
            r1.unfinishedMessage = r2
        L_0x0072:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170918Hz.A06(X.8Hz, java.io.InputStream):X.8Hz");
    }

    public static C170918Hz A07(C170918Hz r4, ByteBuffer byteBuffer) {
        C200279h2 A07;
        C201979ko A00 = C201979ko.A00();
        if (byteBuffer.hasArray()) {
            A07 = C200279h2.A07(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else if (!byteBuffer.isDirect() || !UnsafeUtil.A06) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            A07 = C200279h2.A07(bArr, 0, remaining);
        } else {
            A07 = new AnonymousClass8I8(byteBuffer);
        }
        C170918Hz A05 = A05(A07, A00, r4);
        A0W(A05);
        A0W(A05);
        return A05;
    }

    public static AnonymousClass8I0 A09(B62 b62) {
        int size = b62.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        AnonymousClass8I0 r3 = (AnonymousClass8I0) b62;
        if (i >= r3.A00) {
            return new AnonymousClass8I0(Arrays.copyOf(r3.A01, i), r3.A00);
        }
        throw C165617ti.A0U();
    }

    public static C23122B6c A0A(C23122B6c b6c) {
        int size = b6c.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        return b6c.BQ1(i);
    }

    public static AnonymousClass9LW A0C(B63 b63, String str, Object[] objArr) {
        return A0B(b63, str, objArr);
    }

    public static C173308Re A0F(AnonymousClass8NN r1, AnonymousClass8N3 r2, AnonymousClass3T1 r3) {
        C202359le.A03(r2, r3.A0T().A00);
        r2.A0S();
        C173308Re r22 = (C173308Re) r2.A00;
        C170918Hz A0R = r1.A0R();
        int i = C173308Re.BUTTONS_FIELD_NUMBER;
        A0R.getClass();
        r22.header_ = A0R;
        return r22;
    }

    public static AnonymousClass8SN A0H(AnonymousClass8NN r1, AnonymousClass8NN r2) {
        r1.A0S();
        AnonymousClass8SN r12 = (AnonymousClass8SN) r1.A00;
        C170918Hz A0R = r2.A0R();
        A0R.getClass();
        r12.media_ = A0R;
        return r12;
    }

    public static AnonymousClass8SN A0I(AnonymousClass8NN r1, AnonymousClass8ND r2) {
        r2.A0U();
        r2.A0S();
        AnonymousClass8SN r22 = (AnonymousClass8SN) r2.A00;
        C170918Hz A0R = r1.A0R();
        int i = AnonymousClass8SN.DOCUMENT_MESSAGE_FIELD_NUMBER;
        A0R.getClass();
        r22.media_ = A0R;
        return r22;
    }

    public static AnonymousClass8NG A0Q(C170918Hz r0) {
        return (AnonymousClass8NG) r0.A0q();
    }

    public static Object A0T(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw C90524aI.A0e("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw C90524aI.A0e("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public void A0s() {
        C165577te.A0O(this).BP1(this);
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void Bxe(CodedOutputStream codedOutputStream) {
        C23073B3d A0O = C165577te.A0O(this);
        AnonymousClass9TV r0 = codedOutputStream.A00;
        if (r0 == null) {
            r0 = new AnonymousClass9TV(codedOutputStream);
        }
        A0O.Bxf(r0, this);
    }

    public int hashCode() {
        if (A0t()) {
            return C165577te.A0O(this).BK8(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int BK8 = C165577te.A0O(this).BK8(this);
        this.memoizedHashCode = BK8;
        return BK8;
    }

    public String toString() {
        String obj = super.toString();
        char[] cArr = C200639hs.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("# ");
        A0u.append(obj);
        C200639hs.A00(this, A0u, 0);
        return A0u.toString();
    }

    public Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        AnonymousClass7cS r02;
        AnonymousClass7cS r03;
        AnonymousClass7cS r04;
        AnonymousClass7cS r05;
        AnonymousClass7cS r06;
        AnonymousClass7cS r07;
        AnonymousClass7cS r08;
        AnonymousClass7cS r09;
        AnonymousClass7cS r010;
        AnonymousClass7cS r011;
        AnonymousClass7cS r012;
        AnonymousClass7cS r013;
        AnonymousClass7cS r014;
        AnonymousClass7cS r015;
        AnonymousClass7cS r016;
        AnonymousClass7cS r017;
        AnonymousClass7cS r018;
        AnonymousClass7cS r019;
        AnonymousClass7cS r020;
        AnonymousClass7cS r021;
        AnonymousClass7cS r022;
        AnonymousClass7cS r2;
        AnonymousClass7cS r023;
        AnonymousClass7cS r024;
        AnonymousClass7cS r025;
        AnonymousClass7cS r026;
        AnonymousClass7cS r027;
        AnonymousClass7cS r028;
        AnonymousClass7cS r029;
        AnonymousClass7cS r030;
        AnonymousClass7cS r031;
        AnonymousClass7cS r032;
        AnonymousClass7cS r033;
        AnonymousClass7cS r034;
        AnonymousClass7cS r035;
        AnonymousClass7cS r036;
        AnonymousClass7cS r037;
        AnonymousClass7cS r038;
        AnonymousClass7cS r039;
        AnonymousClass7cS r040;
        AnonymousClass7cS r041;
        AnonymousClass7cS r042;
        AnonymousClass7cS r043;
        AnonymousClass7cS r044;
        AnonymousClass7cS r045;
        AnonymousClass7cS r046;
        AnonymousClass7cS r047;
        AnonymousClass7cS r048;
        AnonymousClass7cS r049;
        AnonymousClass7cS r050;
        AnonymousClass7cS r051;
        AnonymousClass7cS r052;
        AnonymousClass7cS r053;
        AnonymousClass7cS r054;
        AnonymousClass7cS r055;
        AnonymousClass7cS r056;
        AnonymousClass7cS r057;
        AnonymousClass7cS r058;
        AnonymousClass7cS r059;
        AnonymousClass7cS r060;
        AnonymousClass7cS r061;
        AnonymousClass7cS r062;
        AnonymousClass7cS r063;
        AnonymousClass7cS r064;
        AnonymousClass7cS r065;
        AnonymousClass7cS r066;
        AnonymousClass7cS r067;
        AnonymousClass7cS r068;
        AnonymousClass7cS r069;
        AnonymousClass7cS r070;
        AnonymousClass7cS r071;
        AnonymousClass7cS r072;
        AnonymousClass7cS r073;
        AnonymousClass7cS r074;
        AnonymousClass7cS r075;
        AnonymousClass7cS r076;
        AnonymousClass7cS r077;
        AnonymousClass7cS r078;
        AnonymousClass7cS r079;
        AnonymousClass7cS r080;
        AnonymousClass7cS r081;
        AnonymousClass7cS r082;
        AnonymousClass7cS r083;
        AnonymousClass7cS r084;
        AnonymousClass7cS r085;
        AnonymousClass7cS r086;
        AnonymousClass7cS r087;
        AnonymousClass7cS r088;
        AnonymousClass7cS r089;
        AnonymousClass7cS r090;
        AnonymousClass7cS r091;
        AnonymousClass7cS r092;
        AnonymousClass7cS r093;
        AnonymousClass7cS r094;
        AnonymousClass7cS r095;
        AnonymousClass7cS r096;
        AnonymousClass7cS r097;
        AnonymousClass7cS r098;
        AnonymousClass7cS r099;
        AnonymousClass7cS r0100;
        AnonymousClass7cS r0101;
        AnonymousClass7cS r0102;
        AnonymousClass7cS r0103;
        AnonymousClass7cS r0104;
        AnonymousClass7cS r0105;
        AnonymousClass7cS r0106;
        AnonymousClass7cS r0107;
        AnonymousClass7cS r0108;
        AnonymousClass7cS r0109;
        AnonymousClass7cS r0110;
        AnonymousClass7cS r0111;
        AnonymousClass7cS r0112;
        AnonymousClass7cS r0113;
        AnonymousClass7cS r0114;
        AnonymousClass7cS r0115;
        AnonymousClass7cS r0116;
        AnonymousClass7cS r0117;
        AnonymousClass7cS r0118;
        AnonymousClass7cS r0119;
        AnonymousClass7cS r0120;
        AnonymousClass7cS r0121;
        AnonymousClass7cS r0122;
        AnonymousClass7cS r0123;
        AnonymousClass7cS r0124;
        AnonymousClass7cS r0125;
        AnonymousClass7cS r0126;
        AnonymousClass7cS r0127;
        AnonymousClass7cS r0128;
        AnonymousClass7cS r0129;
        AnonymousClass7cS r0130;
        AnonymousClass7cS r0131;
        AnonymousClass7cS r0132;
        AnonymousClass7cS r0133;
        AnonymousClass7cS r0134;
        AnonymousClass7cS r0135;
        AnonymousClass7cS r0136;
        AnonymousClass7cS r0137;
        AnonymousClass7cS r0138;
        AnonymousClass7cS r0139;
        AnonymousClass7cS r0140;
        AnonymousClass7cS r0141;
        AnonymousClass7cS r0142;
        AnonymousClass7cS r0143;
        AnonymousClass7cS r0144;
        AnonymousClass7cS r0145;
        AnonymousClass7cS r0146;
        AnonymousClass7cS r0147;
        AnonymousClass7cS r0148;
        AnonymousClass7cS r0149;
        AnonymousClass7cS r0150;
        AnonymousClass7cS r0151;
        AnonymousClass7cS r0152;
        AnonymousClass7cS r0153;
        AnonymousClass7cS r0154;
        AnonymousClass7cS r0155;
        if (this instanceof AnonymousClass8S2) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z = C90474aD.A1Z(15);
                    A1Z[1] = "sessionVersion_";
                    A1Z[2] = "localIdentityPublic_";
                    A1Z[3] = "remoteIdentityPublic_";
                    A1Z[4] = "rootKey_";
                    A1Z[5] = "previousCounter_";
                    A1Z[6] = "senderChain_";
                    A1Z[7] = "receiverChains_";
                    A1Z[8] = C173228Qw.class;
                    A1Z[9] = "pendingKeyExchange_";
                    A1Z[10] = "pendingPreKey_";
                    A1Z[11] = "remoteRegistrationId_";
                    A1Z[12] = "localRegistrationId_";
                    A1Z[13] = "needsRefresh_";
                    A1Z[14] = "aliceBaseKey_";
                    return A0B(AnonymousClass8S2.DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004\u0006ဉ\u0005\u0007\u001b\bဉ\u0006\tဉ\u0007\nဋ\b\u000bဋ\t\fဇ\n\rည\u000b", A1Z);
                case 3:
                    return new AnonymousClass8S2();
                case 4:
                    return new AnonymousClass8N0();
                case 5:
                    return AnonymousClass8S2.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0156 = AnonymousClass8S2.PARSER;
                    if (r0156 != null) {
                        return r0156;
                    }
                    synchronized (AnonymousClass8S2.class) {
                        r0155 = AnonymousClass8S2.PARSER;
                        if (r0155 == null) {
                            C201979ko r0157 = C21072A7j.A01;
                            r0155 = C90524aI.A0G(AnonymousClass8S2.DEFAULT_INSTANCE);
                            AnonymousClass8S2.PARSER = r0155;
                        }
                    }
                    return r0155;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QU) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e = A0e();
                    A0e[1] = "preKeyId_";
                    A0e[2] = "baseKey_";
                    A0e[3] = "signedPreKeyId_";
                    return A0B(AnonymousClass8QU.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0002\u0003င\u0001", A0e);
                case 3:
                    return new AnonymousClass8QU();
                case 4:
                    return new C172128Mq();
                case 5:
                    return AnonymousClass8QU.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0158 = AnonymousClass8QU.PARSER;
                    if (r0158 != null) {
                        return r0158;
                    }
                    synchronized (AnonymousClass8QU.class) {
                        r0154 = AnonymousClass8QU.PARSER;
                        if (r0154 == null) {
                            C201979ko r0159 = C21072A7j.A01;
                            r0154 = C90524aI.A0G(AnonymousClass8QU.DEFAULT_INSTANCE);
                            AnonymousClass8QU.PARSER = r0154;
                        }
                    }
                    return r0154;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173288Rc) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z2 = C90474aD.A1Z(8);
                    A1Z2[1] = "sequence_";
                    A1Z2[2] = "localBaseKey_";
                    A1Z2[3] = "localBaseKeyPrivate_";
                    A1Z2[4] = "localRatchetKey_";
                    A1Z2[5] = "localRatchetKeyPrivate_";
                    A1Z2[6] = "localIdentityKey_";
                    A1Z2[7] = "localIdentityKeyPrivate_";
                    return A0B(C173288Rc.DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0007ည\u0005\bည\u0006", A1Z2);
                case 3:
                    return new C173288Rc();
                case 4:
                    return new C172118Mp();
                case 5:
                    return C173288Rc.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0160 = C173288Rc.PARSER;
                    if (r0160 != null) {
                        return r0160;
                    }
                    synchronized (C173288Rc.class) {
                        r0153 = C173288Rc.PARSER;
                        if (r0153 == null) {
                            C201979ko r0161 = C21072A7j.A01;
                            r0153 = C90524aI.A0G(C173288Rc.DEFAULT_INSTANCE);
                            C173288Rc.PARSER = r0153;
                        }
                    }
                    return r0153;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173228Qw) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g = A0g();
                    A0g[1] = "senderRatchetKey_";
                    A0g[2] = "senderRatchetKeyPrivate_";
                    A0g[3] = "chainKey_";
                    A0g[4] = "messageKeys_";
                    A0g[5] = C173218Qv.class;
                    return A0B(C173228Qw.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004\u001b", A0g);
                case 3:
                    return new C173228Qw();
                case 4:
                    return new AnonymousClass8N1();
                case 5:
                    return C173228Qw.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0162 = C173228Qw.PARSER;
                    if (r0162 != null) {
                        return r0162;
                    }
                    synchronized (C173228Qw.class) {
                        r0152 = C173228Qw.PARSER;
                        if (r0152 == null) {
                            C201979ko r0163 = C21072A7j.A01;
                            r0152 = C90524aI.A0G(C173228Qw.DEFAULT_INSTANCE);
                            C173228Qw.PARSER = r0152;
                        }
                    }
                    return r0152;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173218Qv) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f = A0f();
                    A0f[1] = "index_";
                    A0f[2] = "cipherKey_";
                    A0f[3] = "macKey_";
                    A0f[4] = "iv_";
                    return A0B(C173218Qv.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", A0f);
                case 3:
                    return new C173218Qv();
                case 4:
                    return new C172108Mo();
                case 5:
                    return C173218Qv.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0164 = C173218Qv.PARSER;
                    if (r0164 != null) {
                        return r0164;
                    }
                    synchronized (C173218Qv.class) {
                        r0151 = C173218Qv.PARSER;
                        if (r0151 == null) {
                            C201979ko r0165 = C21072A7j.A01;
                            r0151 = C90524aI.A0G(C173218Qv.DEFAULT_INSTANCE);
                            C173218Qv.PARSER = r0151;
                        }
                    }
                    return r0151;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172778Pd) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d = A0d();
                    A0d[1] = "index_";
                    A0d[2] = "key_";
                    return A0B(C172778Pd.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001", A0d);
                case 3:
                    return new C172778Pd();
                case 4:
                    return new AnonymousClass8NA();
                case 5:
                    return C172778Pd.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0166 = C172778Pd.PARSER;
                    if (r0166 != null) {
                        return r0166;
                    }
                    synchronized (C172778Pd.class) {
                        r0150 = C172778Pd.PARSER;
                        if (r0150 == null) {
                            C201979ko r0167 = C21072A7j.A01;
                            r0150 = C90524aI.A0G(C172778Pd.DEFAULT_INSTANCE);
                            C172778Pd.PARSER = r0150;
                        }
                    }
                    return r0150;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173208Qu) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g2 = A0g();
                    A0g2[1] = "senderKeyId_";
                    A0g2[2] = "senderChainKey_";
                    A0g2[3] = "senderSigningKey_";
                    A0g2[4] = "senderMessageKeys_";
                    A0g2[5] = C172758Pb.class;
                    return A0B(C173208Qu.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", A0g2);
                case 3:
                    return new C173208Qu();
                case 4:
                    return new C172078Ml();
                case 5:
                    return C173208Qu.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0168 = C173208Qu.PARSER;
                    if (r0168 != null) {
                        return r0168;
                    }
                    synchronized (C173208Qu.class) {
                        r0149 = C173208Qu.PARSER;
                        if (r0149 == null) {
                            C201979ko r0169 = C21072A7j.A01;
                            r0149 = C90524aI.A0G(C173208Qu.DEFAULT_INSTANCE);
                            C173208Qu.PARSER = r0149;
                        }
                    }
                    return r0149;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172768Pc) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d2 = A0d();
                    A0d2[1] = "public_";
                    A0d2[2] = "private_";
                    return A0B(C172768Pc.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A0d2);
                case 3:
                    return new C172768Pc();
                case 4:
                    return new C172098Mn();
                case 5:
                    return C172768Pc.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0170 = C172768Pc.PARSER;
                    if (r0170 != null) {
                        return r0170;
                    }
                    synchronized (C172768Pc.class) {
                        r0148 = C172768Pc.PARSER;
                        if (r0148 == null) {
                            C201979ko r0171 = C21072A7j.A01;
                            r0148 = C90524aI.A0G(C172768Pc.DEFAULT_INSTANCE);
                            C172768Pc.PARSER = r0148;
                        }
                    }
                    return r0148;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172758Pb) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d3 = A0d();
                    A0d3[1] = "iteration_";
                    A0d3[2] = "seed_";
                    return A0B(C172758Pb.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001", A0d3);
                case 3:
                    return new C172758Pb();
                case 4:
                    return new C172088Mm();
                case 5:
                    return C172758Pb.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0172 = C172758Pb.PARSER;
                    if (r0172 != null) {
                        return r0172;
                    }
                    synchronized (C172758Pb.class) {
                        r0147 = C172758Pb.PARSER;
                        if (r0147 == null) {
                            C201979ko r0173 = C21072A7j.A01;
                            r0147 = C90524aI.A0G(C172758Pb.DEFAULT_INSTANCE);
                            C172758Pb.PARSER = r0147;
                        }
                    }
                    return r0147;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172748Pa) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d4 = A0d();
                    A0d4[1] = "iteration_";
                    A0d4[2] = "seed_";
                    return A0B(C172748Pa.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001", A0d4);
                case 3:
                    return new C172748Pa();
                case 4:
                    return new AnonymousClass8N9();
                case 5:
                    return C172748Pa.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0174 = C172748Pa.PARSER;
                    if (r0174 != null) {
                        return r0174;
                    }
                    synchronized (C172748Pa.class) {
                        r0146 = C172748Pa.PARSER;
                        if (r0146 == null) {
                            C201979ko r0175 = C21072A7j.A01;
                            r0146 = C90524aI.A0G(C172748Pa.DEFAULT_INSTANCE);
                            C172748Pa.PARSER = r0146;
                        }
                    }
                    return r0146;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172258Nd) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0M = AnonymousClass001.A0M();
                    A0M[0] = "senderKeyStates_";
                    A0M[1] = C173208Qu.class;
                    return A0B(C172258Nd.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A0M);
                case 3:
                    return new C172258Nd();
                case 4:
                    return new C172068Mk();
                case 5:
                    return C172258Nd.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0176 = C172258Nd.PARSER;
                    if (r0176 != null) {
                        return r0176;
                    }
                    synchronized (C172258Nd.class) {
                        r0145 = C172258Nd.PARSER;
                        if (r0145 == null) {
                            C201979ko r0177 = C21072A7j.A01;
                            r0145 = C90524aI.A0G(C172258Nd.DEFAULT_INSTANCE);
                            C172258Nd.PARSER = r0145;
                        }
                    }
                    return r0145;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PZ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e2 = A0e();
                    A0e2[1] = "currentSession_";
                    A0e2[2] = "previousSessions_";
                    A0e2[3] = AnonymousClass8S2.class;
                    return A0B(AnonymousClass8PZ.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", A0e2);
                case 3:
                    return new AnonymousClass8PZ();
                case 4:
                    return new C172218Mz();
                case 5:
                    return AnonymousClass8PZ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0178 = AnonymousClass8PZ.PARSER;
                    if (r0178 != null) {
                        return r0178;
                    }
                    synchronized (AnonymousClass8PZ.class) {
                        r0144 = AnonymousClass8PZ.PARSER;
                        if (r0144 == null) {
                            C201979ko r0179 = C21072A7j.A01;
                            r0144 = C90524aI.A0G(AnonymousClass8PZ.DEFAULT_INSTANCE);
                            AnonymousClass8PZ.PARSER = r0144;
                        }
                    }
                    return r0144;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QT) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e3 = A0e();
                    A0e3[1] = "id_";
                    A0e3[2] = "publicKey_";
                    A0e3[3] = "privateKey_";
                    return A0B(AnonymousClass8QT.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002", A0e3);
                case 3:
                    return new AnonymousClass8QT();
                case 4:
                    return new C172058Mj();
                case 5:
                    return AnonymousClass8QT.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0180 = AnonymousClass8QT.PARSER;
                    if (r0180 != null) {
                        return r0180;
                    }
                    synchronized (AnonymousClass8QT.class) {
                        r0143 = AnonymousClass8QT.PARSER;
                        if (r0143 == null) {
                            C201979ko r0181 = C21072A7j.A01;
                            r0143 = C90524aI.A0G(AnonymousClass8QT.DEFAULT_INSTANCE);
                            AnonymousClass8QT.PARSER = r0143;
                        }
                    }
                    return r0143;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QS) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f2 = A0f();
                    A0f2[1] = "senderKeyId_";
                    A0f2[2] = "senderChainKeys_";
                    A0f2[3] = C172748Pa.class;
                    A0f2[4] = "senderSigningKey_";
                    return A0B(AnonymousClass8QS.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b\u0003ဉ\u0001", A0f2);
                case 3:
                    return new AnonymousClass8QS();
                case 4:
                    return new C172208My();
                case 5:
                    return AnonymousClass8QS.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0182 = AnonymousClass8QS.PARSER;
                    if (r0182 != null) {
                        return r0182;
                    }
                    synchronized (AnonymousClass8QS.class) {
                        r0142 = AnonymousClass8QS.PARSER;
                        if (r0142 == null) {
                            C201979ko r0183 = C21072A7j.A01;
                            r0142 = C90524aI.A0G(AnonymousClass8QS.DEFAULT_INSTANCE);
                            AnonymousClass8QS.PARSER = r0142;
                        }
                    }
                    return r0142;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172248Nc) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0M2 = AnonymousClass001.A0M();
                    A0M2[0] = "senderKeyStates_";
                    A0M2[1] = AnonymousClass8QS.class;
                    return A0B(C172248Nc.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A0M2);
                case 3:
                    return new C172248Nc();
                case 4:
                    return new C172048Mi();
                case 5:
                    return C172248Nc.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0184 = C172248Nc.PARSER;
                    if (r0184 != null) {
                        return r0184;
                    }
                    synchronized (C172248Nc.class) {
                        r0141 = C172248Nc.PARSER;
                        if (r0141 == null) {
                            C201979ko r0185 = C21072A7j.A01;
                            r0141 = C90524aI.A0G(C172248Nc.DEFAULT_INSTANCE);
                            C172248Nc.PARSER = r0141;
                        }
                    }
                    return r0141;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173198Qt) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f3 = A0f();
                    A0f3[1] = "ratchetKey_";
                    A0f3[2] = "counter_";
                    A0f3[3] = "previousCounter_";
                    A0f3[4] = "ciphertext_";
                    return A0B(C173198Qt.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ည\u0003", A0f3);
                case 3:
                    return new C173198Qt();
                case 4:
                    return new C172038Mh();
                case 5:
                    return C173198Qt.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0186 = C173198Qt.PARSER;
                    if (r0186 != null) {
                        return r0186;
                    }
                    synchronized (C173198Qt.class) {
                        r0140 = C173198Qt.PARSER;
                        if (r0140 == null) {
                            C201979ko r0187 = C21072A7j.A01;
                            r0140 = C90524aI.A0G(C173198Qt.DEFAULT_INSTANCE);
                            C173198Qt.PARSER = r0140;
                        }
                    }
                    return r0140;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QR) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e4 = A0e();
                    A0e4[1] = "id_";
                    A0e4[2] = "iteration_";
                    A0e4[3] = "ciphertext_";
                    return A0B(AnonymousClass8QR.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002", A0e4);
                case 3:
                    return new AnonymousClass8QR();
                case 4:
                    return new C172028Mg();
                case 5:
                    return AnonymousClass8QR.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0188 = AnonymousClass8QR.PARSER;
                    if (r0188 != null) {
                        return r0188;
                    }
                    synchronized (AnonymousClass8QR.class) {
                        r0139 = AnonymousClass8QR.PARSER;
                        if (r0139 == null) {
                            C201979ko r0189 = C21072A7j.A01;
                            r0139 = C90524aI.A0G(AnonymousClass8QR.DEFAULT_INSTANCE);
                            AnonymousClass8QR.PARSER = r0139;
                        }
                    }
                    return r0139;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173188Qs) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f4 = A0f();
                    A0f4[1] = "id_";
                    A0f4[2] = "iteration_";
                    A0f4[3] = "chainKey_";
                    A0f4[4] = "signingKey_";
                    return A0B(C173188Qs.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ည\u0003", A0f4);
                case 3:
                    return new C173188Qs();
                case 4:
                    return new C172018Mf();
                case 5:
                    return C173188Qs.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0190 = C173188Qs.PARSER;
                    if (r0190 != null) {
                        return r0190;
                    }
                    synchronized (C173188Qs.class) {
                        r0138 = C173188Qs.PARSER;
                        if (r0138 == null) {
                            C201979ko r0191 = C21072A7j.A01;
                            r0138 = C90524aI.A0G(C173188Qs.DEFAULT_INSTANCE);
                            C173188Qs.PARSER = r0138;
                        }
                    }
                    return r0138;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RU) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z3 = C90474aD.A1Z(7);
                    A1Z3[1] = "preKeyId_";
                    A1Z3[2] = "baseKey_";
                    A1Z3[3] = "identityKey_";
                    A1Z3[4] = "message_";
                    A1Z3[5] = "registrationId_";
                    A1Z3[6] = "signedPreKeyId_";
                    return A0B(AnonymousClass8RU.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0001\u0002ည\u0003\u0003ည\u0004\u0004ည\u0005\u0005ဋ\u0000\u0006ဋ\u0002", A1Z3);
                case 3:
                    return new AnonymousClass8RU();
                case 4:
                    return new C172008Me();
                case 5:
                    return AnonymousClass8RU.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0192 = AnonymousClass8RU.PARSER;
                    if (r0192 != null) {
                        return r0192;
                    }
                    synchronized (AnonymousClass8RU.class) {
                        r0137 = AnonymousClass8RU.PARSER;
                        if (r0137 == null) {
                            C201979ko r0193 = C21072A7j.A01;
                            r0137 = C90524aI.A0G(AnonymousClass8RU.DEFAULT_INSTANCE);
                            AnonymousClass8RU.PARSER = r0137;
                        }
                    }
                    return r0137;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173178Qr) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f5 = A0f();
                    A0f5[1] = "id_";
                    A0f5[2] = "iteration_";
                    A0f5[3] = "chainKeys_";
                    A0f5[4] = "signingKey_";
                    return A0B(C173178Qr.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003\u001c\u0004ည\u0002", A0f5);
                case 3:
                    return new C173178Qr();
                case 4:
                    return new C171998Md();
                case 5:
                    return C173178Qr.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0194 = C173178Qr.PARSER;
                    if (r0194 != null) {
                        return r0194;
                    }
                    synchronized (C173178Qr.class) {
                        r0136 = C173178Qr.PARSER;
                        if (r0136 == null) {
                            C201979ko r0195 = C21072A7j.A01;
                            r0136 = C90524aI.A0G(C173178Qr.DEFAULT_INSTANCE);
                            C173178Qr.PARSER = r0136;
                        }
                    }
                    return r0136;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PY) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d5 = A0d();
                    A0d5[1] = "content_";
                    A0d5[2] = "identifier_";
                    return A0B(AnonymousClass8PY.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A0d5);
                case 3:
                    return new AnonymousClass8PY();
                case 4:
                    return new C171988Mc();
                case 5:
                    return AnonymousClass8PY.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0196 = AnonymousClass8PY.PARSER;
                    if (r0196 != null) {
                        return r0196;
                    }
                    synchronized (AnonymousClass8PY.class) {
                        r0135 = AnonymousClass8PY.PARSER;
                        if (r0135 == null) {
                            C201979ko r0197 = C21072A7j.A01;
                            r0135 = C90524aI.A0G(AnonymousClass8PY.DEFAULT_INSTANCE);
                            AnonymousClass8PY.PARSER = r0135;
                        }
                    }
                    return r0135;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QQ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e5 = A0e();
                    A0e5[1] = "version_";
                    A0e5[2] = "localFingerprint_";
                    A0e5[3] = "remoteFingerprint_";
                    return A0B(AnonymousClass8QQ.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", A0e5);
                case 3:
                    return new AnonymousClass8QQ();
                case 4:
                    return new C171978Mb();
                case 5:
                    return AnonymousClass8QQ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0198 = AnonymousClass8QQ.PARSER;
                    if (r0198 != null) {
                        return r0198;
                    }
                    synchronized (AnonymousClass8QQ.class) {
                        r0134 = AnonymousClass8QQ.PARSER;
                        if (r0134 == null) {
                            C201979ko r0199 = C21072A7j.A01;
                            r0134 = C90524aI.A0G(AnonymousClass8QQ.DEFAULT_INSTANCE);
                            AnonymousClass8QQ.PARSER = r0134;
                        }
                    }
                    return r0134;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172878Pn) {
            C172878Pn r22 = (C172878Pn) this;
            int i = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r22.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    r22.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    Object[] A1Q = C36441kJ.A1Q();
                    A1Q[0] = "bitField0_";
                    A1Q[1] = "campaignId_";
                    A1Q[2] = "campaignExpirationTimestamp_";
                    return A0B(C172878Pn.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001,-\u0002\u0000\u0000\u0001,ᔃ\u0000-ဃ\u0001", A1Q);
                case 3:
                    return new C172878Pn();
                case 4:
                    return new C171968Ma();
                case 5:
                    return C172878Pn.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0200 = C172878Pn.PARSER;
                    if (r0200 != null) {
                        return r0200;
                    }
                    synchronized (C172878Pn.class) {
                        r0133 = C172878Pn.PARSER;
                        if (r0133 == null) {
                            C201979ko r0201 = C21072A7j.A01;
                            r0133 = C90524aI.A0G(C172878Pn.DEFAULT_INSTANCE);
                            C172878Pn.PARSER = r0133;
                        }
                    }
                    return r0133;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172488Oa) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c = A0c();
                    A0c[1] = "reportingTag_";
                    return A0B(C172488Oa.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", A0c);
                case 3:
                    return new C172488Oa();
                case 4:
                    return new AnonymousClass8MZ();
                case 5:
                    return C172488Oa.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0202 = C172488Oa.PARSER;
                    if (r0202 != null) {
                        return r0202;
                    }
                    synchronized (C172488Oa.class) {
                        r0132 = C172488Oa.PARSER;
                        if (r0132 == null) {
                            C201979ko r0203 = C21072A7j.A01;
                            r0132 = C90524aI.A0G(C172488Oa.DEFAULT_INSTANCE);
                            C172488Oa.PARSER = r0132;
                        }
                    }
                    return r0132;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RO) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g3 = A0g();
                    A0g3[1] = "key_";
                    A0g3[2] = "text_";
                    A0g3[3] = "groupingKey_";
                    A0g3[4] = "senderTimestampMs_";
                    A0g3[5] = "unread_";
                    return A0B(AnonymousClass8RO.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", A0g3);
                case 3:
                    return new AnonymousClass8RO();
                case 4:
                    return new AnonymousClass8MY();
                case 5:
                    return AnonymousClass8RO.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0204 = AnonymousClass8RO.PARSER;
                    if (r0204 != null) {
                        return r0204;
                    }
                    synchronized (AnonymousClass8RO.class) {
                        r0131 = AnonymousClass8RO.PARSER;
                        if (r0131 == null) {
                            C201979ko r0205 = C21072A7j.A01;
                            r0131 = C90524aI.A0G(AnonymousClass8RO.DEFAULT_INSTANCE);
                            AnonymousClass8RO.PARSER = r0131;
                        }
                    }
                    return r0131;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OZ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c2 = A0c();
                    A0c2[1] = "serverCampaignId_";
                    return A0B(AnonymousClass8OZ.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A0c2);
                case 3:
                    return new AnonymousClass8OZ();
                case 4:
                    return new AnonymousClass8MX();
                case 5:
                    return AnonymousClass8OZ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0206 = AnonymousClass8OZ.PARSER;
                    if (r0206 != null) {
                        return r0206;
                    }
                    synchronized (AnonymousClass8OZ.class) {
                        r0130 = AnonymousClass8OZ.PARSER;
                        if (r0130 == null) {
                            C201979ko r0207 = C21072A7j.A01;
                            r0130 = C90524aI.A0G(AnonymousClass8OZ.DEFAULT_INSTANCE);
                            AnonymousClass8OZ.PARSER = r0130;
                        }
                    }
                    return r0130;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RN) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g4 = A0g();
                    A0g4[1] = "pollUpdateMessageKey_";
                    A0g4[2] = "vote_";
                    A0g4[3] = "senderTimestampMs_";
                    A0g4[4] = "serverTimestampMs_";
                    A0g4[5] = "unread_";
                    return A0B(AnonymousClass8RN.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", A0g4);
                case 3:
                    return new AnonymousClass8RN();
                case 4:
                    return new AnonymousClass8MW();
                case 5:
                    return AnonymousClass8RN.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0208 = AnonymousClass8RN.PARSER;
                    if (r0208 != null) {
                        return r0208;
                    }
                    synchronized (AnonymousClass8RN.class) {
                        r0129 = AnonymousClass8RN.PARSER;
                        if (r0129 == null) {
                            C201979ko r0209 = C21072A7j.A01;
                            r0129 = C90524aI.A0G(AnonymousClass8RN.DEFAULT_INSTANCE);
                            AnonymousClass8RN.PARSER = r0129;
                        }
                    }
                    return r0129;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OY) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c3 = A0c();
                    A0c3[1] = "pollInvalidated_";
                    return A0B(AnonymousClass8OY.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c3);
                case 3:
                    return new AnonymousClass8OY();
                case 4:
                    return new AnonymousClass8MV();
                case 5:
                    return AnonymousClass8OY.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0210 = AnonymousClass8OY.PARSER;
                    if (r0210 != null) {
                        return r0210;
                    }
                    synchronized (AnonymousClass8OY.class) {
                        r0128 = AnonymousClass8OY.PARSER;
                        if (r0128 == null) {
                            C201979ko r0211 = C21072A7j.A01;
                            r0128 = C90524aI.A0G(AnonymousClass8OY.DEFAULT_INSTANCE);
                            AnonymousClass8OY.PARSER = r0128;
                        }
                    }
                    return r0128;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RM) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z4 = C90474aD.A1Z(7);
                    A1Z4[1] = "type_";
                    A1Z4[2] = C21063A7a.A00;
                    A1Z4[3] = "key_";
                    A1Z4[4] = "senderTimestampMs_";
                    A1Z4[5] = "serverTimestampMs_";
                    A1Z4[6] = "messageAddOnContextInfo_";
                    return A0B(AnonymousClass8RM.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004", A1Z4);
                case 3:
                    return new AnonymousClass8RM();
                case 4:
                    return new AnonymousClass8MU();
                case 5:
                    return AnonymousClass8RM.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0212 = AnonymousClass8RM.PARSER;
                    if (r0212 != null) {
                        return r0212;
                    }
                    synchronized (AnonymousClass8RM.class) {
                        r0127 = AnonymousClass8RM.PARSER;
                        if (r0127 == null) {
                            C201979ko r0213 = C21072A7j.A01;
                            r0127 = C90524aI.A0G(AnonymousClass8RM.DEFAULT_INSTANCE);
                            AnonymousClass8RM.PARSER = r0127;
                        }
                    }
                    return r0127;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QP) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e6 = A0e();
                    A0e6[1] = "oldPhoto_";
                    A0e6[2] = "newPhoto_";
                    A0e6[3] = "newPhotoId_";
                    return A0B(AnonymousClass8QP.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဋ\u0002", A0e6);
                case 3:
                    return new AnonymousClass8QP();
                case 4:
                    return new AnonymousClass8MT();
                case 5:
                    return AnonymousClass8QP.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0214 = AnonymousClass8QP.PARSER;
                    if (r0214 != null) {
                        return r0214;
                    }
                    synchronized (AnonymousClass8QP.class) {
                        r0126 = AnonymousClass8QP.PARSER;
                        if (r0126 == null) {
                            C201979ko r0215 = C21072A7j.A01;
                            r0126 = C90524aI.A0G(AnonymousClass8QP.DEFAULT_INSTANCE);
                            AnonymousClass8QP.PARSER = r0126;
                        }
                    }
                    return r0126;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8S3) {
            AnonymousClass8S3 r23 = (AnonymousClass8S3) this;
            int i2 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r23.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i2 = 0;
                    }
                    r23.memoizedIsInitialized = (byte) i2;
                    return null;
                case 2:
                    return A0B(AnonymousClass8S3.DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဃ\t\u000bဂ\n\fဈ\u000b\rင\f\u000eᐉ\r", new Object[]{"bitField0_", "amount1000_", "bankTransactionId_", "credentialId_", "currency_", "errorCode_", "groupJid_", "messageStanzaId_", "recieverJid_", "senderJid_", "status_", "timestamp_", "transactionId_", "type_", "metadata_"});
                case 3:
                    return new AnonymousClass8S3();
                case 4:
                    return new AnonymousClass8MS();
                case 5:
                    return AnonymousClass8S3.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0216 = AnonymousClass8S3.PARSER;
                    if (r0216 != null) {
                        return r0216;
                    }
                    synchronized (AnonymousClass8S3.class) {
                        r0125 = AnonymousClass8S3.PARSER;
                        if (r0125 == null) {
                            C201979ko r0217 = C21072A7j.A01;
                            r0125 = C90524aI.A0G(AnonymousClass8S3.DEFAULT_INSTANCE);
                            AnonymousClass8S3.PARSER = r0125;
                        }
                    }
                    return r0125;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8S1) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z5 = C90474aD.A1Z(17);
                    A1Z5[1] = "currencyDeprecated_";
                    A1Z5[2] = A7X.A00;
                    A1Z5[3] = "amount1000_";
                    A1Z5[4] = "receiverJid_";
                    A1Z5[5] = "status_";
                    A1Z5[6] = A7Y.A00;
                    A1Z5[7] = "transactionTimestamp_";
                    A1Z5[8] = "requestMessageKey_";
                    A1Z5[9] = "expiryTimestamp_";
                    A1Z5[10] = "futureproofed_";
                    A1Z5[11] = "currency_";
                    A1Z5[12] = "txnStatus_";
                    A1Z5[13] = A7Z.A00;
                    A1Z5[14] = "useNoviFiatFormat_";
                    A1Z5[15] = "primaryAmount_";
                    A1Z5[16] = "exchangeAmount_";
                    return A0B(AnonymousClass8S1.DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဃ\u0004\u0006ဉ\u0005\u0007ဃ\u0006\bဇ\u0007\tဈ\b\nဌ\t\u000bဇ\n\fဉ\u000b\rဉ\f", A1Z5);
                case 3:
                    return new AnonymousClass8S1();
                case 4:
                    return new AnonymousClass8MR();
                case 5:
                    return AnonymousClass8S1.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0218 = AnonymousClass8S1.PARSER;
                    if (r0218 != null) {
                        return r0218;
                    }
                    synchronized (AnonymousClass8S1.class) {
                        r0124 = AnonymousClass8S1.PARSER;
                        if (r0124 == null) {
                            C201979ko r0219 = C21072A7j.A01;
                            r0124 = C90524aI.A0G(AnonymousClass8S1.DEFAULT_INSTANCE);
                            AnonymousClass8S1.PARSER = r0124;
                        }
                    }
                    return r0124;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OX) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c4 = A0c();
                    A0c4[1] = "messageAddOnDurationInSecs_";
                    return A0B(AnonymousClass8OX.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", A0c4);
                case 3:
                    return new AnonymousClass8OX();
                case 4:
                    return new AnonymousClass8MQ();
                case 5:
                    return AnonymousClass8OX.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0220 = AnonymousClass8OX.PARSER;
                    if (r0220 != null) {
                        return r0220;
                    }
                    synchronized (AnonymousClass8OX.class) {
                        r0123 = AnonymousClass8OX.PARSER;
                        if (r0123 == null) {
                            C201979ko r0221 = C21072A7j.A01;
                            r0123 = C90524aI.A0G(AnonymousClass8OX.DEFAULT_INSTANCE);
                            AnonymousClass8OX.PARSER = r0123;
                        }
                    }
                    return r0123;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OW) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c5 = A0c();
                    A0c5[1] = "localPath_";
                    return A0B(AnonymousClass8OW.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A0c5);
                case 3:
                    return new AnonymousClass8OW();
                case 4:
                    return new AnonymousClass8MP();
                case 5:
                    return AnonymousClass8OW.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0222 = AnonymousClass8OW.PARSER;
                    if (r0222 != null) {
                        return r0222;
                    }
                    synchronized (AnonymousClass8OW.class) {
                        r0122 = AnonymousClass8OW.PARSER;
                        if (r0122 == null) {
                            C201979ko r0223 = C21072A7j.A01;
                            r0122 = C90524aI.A0G(AnonymousClass8OW.DEFAULT_INSTANCE);
                            AnonymousClass8OW.PARSER = r0122;
                        }
                    }
                    return r0122;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RT) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z6 = C90474aD.A1Z(8);
                    A1Z6[1] = "keepType_";
                    A1Z6[2] = C21043A6g.A00;
                    A1Z6[3] = "serverTimestamp_";
                    A1Z6[4] = "key_";
                    A1Z6[5] = "deviceJid_";
                    A1Z6[6] = "clientTimestampMs_";
                    A1Z6[7] = "serverTimestampMs_";
                    return A0B(AnonymousClass8RT.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", A1Z6);
                case 3:
                    return new AnonymousClass8RT();
                case 4:
                    return new AnonymousClass8MO();
                case 5:
                    return AnonymousClass8RT.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0224 = AnonymousClass8RT.PARSER;
                    if (r0224 != null) {
                        return r0224;
                    }
                    synchronized (AnonymousClass8RT.class) {
                        r0121 = AnonymousClass8RT.PARSER;
                        if (r0121 == null) {
                            C201979ko r0225 = C21072A7j.A01;
                            r0121 = C90524aI.A0G(AnonymousClass8RT.DEFAULT_INSTANCE);
                            AnonymousClass8RT.PARSER = r0121;
                        }
                    }
                    return r0121;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173168Qq) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f6 = A0f();
                    A0f6[1] = "eventResponseMessageKey_";
                    A0f6[2] = "timestampMs_";
                    A0f6[3] = "eventResponseMessage_";
                    A0f6[4] = "unread_";
                    return A0B(C173168Qq.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", A0f6);
                case 3:
                    return new C173168Qq();
                case 4:
                    return new AnonymousClass8MN();
                case 5:
                    return C173168Qq.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0226 = C173168Qq.PARSER;
                    if (r0226 != null) {
                        return r0226;
                    }
                    synchronized (C173168Qq.class) {
                        r0120 = C173168Qq.PARSER;
                        if (r0120 == null) {
                            C201979ko r0227 = C21072A7j.A01;
                            r0120 = C90524aI.A0G(C173168Qq.DEFAULT_INSTANCE);
                            C173168Qq.PARSER = r0120;
                        }
                    }
                    return r0120;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OV) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c6 = A0c();
                    A0c6[1] = "isStale_";
                    return A0B(AnonymousClass8OV.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c6);
                case 3:
                    return new AnonymousClass8OV();
                case 4:
                    return new AnonymousClass8MM();
                case 5:
                    return AnonymousClass8OV.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0228 = AnonymousClass8OV.PARSER;
                    if (r0228 != null) {
                        return r0228;
                    }
                    synchronized (AnonymousClass8OV.class) {
                        r0119 = AnonymousClass8OV.PARSER;
                        if (r0119 == null) {
                            C201979ko r0229 = C21072A7j.A01;
                            r0119 = C90524aI.A0G(AnonymousClass8OV.DEFAULT_INSTANCE);
                            AnonymousClass8OV.PARSER = r0119;
                        }
                    }
                    return r0119;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PX) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d6 = A0d();
                    A0d6[1] = "commentParentKey_";
                    A0d6[2] = "replyCount_";
                    return A0B(AnonymousClass8PX.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001", A0d6);
                case 3:
                    return new AnonymousClass8PX();
                case 4:
                    return new AnonymousClass8ML();
                case 5:
                    return AnonymousClass8PX.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0230 = AnonymousClass8PX.PARSER;
                    if (r0230 != null) {
                        return r0230;
                    }
                    synchronized (AnonymousClass8PX.class) {
                        r0118 = AnonymousClass8PX.PARSER;
                        if (r0118 == null) {
                            C201979ko r0231 = C21072A7j.A01;
                            r0118 = C90524aI.A0G(AnonymousClass8PX.DEFAULT_INSTANCE);
                            AnonymousClass8PX.PARSER = r0118;
                        }
                    }
                    return r0118;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QO) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e7 = A0e();
                    A0e7[1] = "clientHello_";
                    A0e7[2] = "serverHello_";
                    A0e7[3] = "clientFinish_";
                    return A0B(AnonymousClass8QO.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", A0e7);
                case 3:
                    return new AnonymousClass8QO();
                case 4:
                    return new AnonymousClass8MH();
                case 5:
                    return AnonymousClass8QO.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0232 = AnonymousClass8QO.PARSER;
                    if (r0232 != null) {
                        return r0232;
                    }
                    synchronized (AnonymousClass8QO.class) {
                        r0117 = AnonymousClass8QO.PARSER;
                        if (r0117 == null) {
                            C201979ko r0233 = C21072A7j.A01;
                            r0117 = C90524aI.A0G(AnonymousClass8QO.DEFAULT_INSTANCE);
                            AnonymousClass8QO.PARSER = r0117;
                        }
                    }
                    return r0117;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QN) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e8 = A0e();
                    A0e8[1] = "ephemeral_";
                    A0e8[2] = "static_";
                    A0e8[3] = "payload_";
                    return A0B(AnonymousClass8QN.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", A0e8);
                case 3:
                    return new AnonymousClass8QN();
                case 4:
                    return new AnonymousClass8MK();
                case 5:
                    return AnonymousClass8QN.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0234 = AnonymousClass8QN.PARSER;
                    if (r0234 != null) {
                        return r0234;
                    }
                    synchronized (AnonymousClass8QN.class) {
                        r0116 = AnonymousClass8QN.PARSER;
                        if (r0116 == null) {
                            C201979ko r0235 = C21072A7j.A01;
                            r0116 = C90524aI.A0G(AnonymousClass8QN.DEFAULT_INSTANCE);
                            AnonymousClass8QN.PARSER = r0116;
                        }
                    }
                    return r0116;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QM) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e9 = A0e();
                    A0e9[1] = "ephemeral_";
                    A0e9[2] = "static_";
                    A0e9[3] = "payload_";
                    return A0B(AnonymousClass8QM.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", A0e9);
                case 3:
                    return new AnonymousClass8QM();
                case 4:
                    return new AnonymousClass8MJ();
                case 5:
                    return AnonymousClass8QM.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0236 = AnonymousClass8QM.PARSER;
                    if (r0236 != null) {
                        return r0236;
                    }
                    synchronized (AnonymousClass8QM.class) {
                        r0115 = AnonymousClass8QM.PARSER;
                        if (r0115 == null) {
                            C201979ko r0237 = C21072A7j.A01;
                            r0115 = C90524aI.A0G(AnonymousClass8QM.DEFAULT_INSTANCE);
                            AnonymousClass8QM.PARSER = r0115;
                        }
                    }
                    return r0115;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PW) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d7 = A0d();
                    A0d7[1] = "static_";
                    A0d7[2] = "payload_";
                    return A0B(AnonymousClass8PW.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A0d7);
                case 3:
                    return new AnonymousClass8PW();
                case 4:
                    return new AnonymousClass8MI();
                case 5:
                    return AnonymousClass8PW.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0238 = AnonymousClass8PW.PARSER;
                    if (r0238 != null) {
                        return r0238;
                    }
                    synchronized (AnonymousClass8PW.class) {
                        r0114 = AnonymousClass8PW.PARSER;
                        if (r0114 == null) {
                            C201979ko r0239 = C21072A7j.A01;
                            r0114 = C90524aI.A0G(AnonymousClass8PW.DEFAULT_INSTANCE);
                            AnonymousClass8PW.PARSER = r0114;
                        }
                    }
                    return r0114;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8SR) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z7 = C90474aD.A1Z(32);
                    A1Z7[1] = "username_";
                    A1Z7[2] = "passive_";
                    A1Z7[3] = "userAgent_";
                    A1Z7[4] = "webInfo_";
                    A1Z7[5] = "pushName_";
                    A1Z7[6] = "sessionId_";
                    A1Z7[7] = "shortConnect_";
                    A1Z7[8] = "connectType_";
                    A1Z7[9] = A7P.A00;
                    A1Z7[10] = "connectReason_";
                    A1Z7[11] = A7O.A00;
                    A1Z7[12] = "shards_";
                    A1Z7[13] = "dnsSource_";
                    A1Z7[14] = "connectAttemptCount_";
                    A1Z7[15] = "device_";
                    A1Z7[16] = "devicePairingData_";
                    A1Z7[17] = "product_";
                    A1Z7[18] = A7S.A00;
                    A1Z7[19] = "fbCat_";
                    A1Z7[20] = "fbUserAgent_";
                    A1Z7[21] = "oc_";
                    A1Z7[22] = "lc_";
                    A1Z7[23] = "iosAppExtension_";
                    A1Z7[24] = A7R.A00;
                    A1Z7[25] = "fbAppId_";
                    A1Z7[26] = "fbDeviceId_";
                    A1Z7[27] = "pull_";
                    A1Z7[28] = "paddingBytes_";
                    A1Z7[29] = "yearClass_";
                    A1Z7[30] = "memClass_";
                    A1Z7[31] = "interopData_";
                    return A0B(AnonymousClass8SR.DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001&\u001b\u0000\u0001\u0000\u0001ဃ\u0000\u0003ဇ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဈ\u0004\tဍ\u0005\nဇ\u0006\fဌ\u0007\rဌ\b\u000e\u0016\u000fဉ\t\u0010ဋ\n\u0012ဋ\u000b\u0013ဉ\f\u0014ဌ\r\u0015ည\u000e\u0016ည\u000f\u0017ဇ\u0010\u0018င\u0011\u001eဌ\u0012\u001fဃ\u0013 ည\u0014!ဇ\u0015\"ည\u0016$င\u0017%င\u0018&ဉ\u0019", A1Z7);
                case 3:
                    return new AnonymousClass8SR();
                case 4:
                    return new AnonymousClass8M9();
                case 5:
                    return AnonymousClass8SR.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0240 = AnonymousClass8SR.PARSER;
                    if (r0240 != null) {
                        return r0240;
                    }
                    synchronized (AnonymousClass8SR.class) {
                        r0113 = AnonymousClass8SR.PARSER;
                        if (r0113 == null) {
                            C201979ko r0241 = C21072A7j.A01;
                            r0113 = C90524aI.A0G(AnonymousClass8SR.DEFAULT_INSTANCE);
                            AnonymousClass8SR.PARSER = r0113;
                        }
                    }
                    return r0113;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8ST) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g5 = A0g();
                    A0g5[1] = "refToken_";
                    A0g5[2] = "version_";
                    A0g5[3] = "webdPayload_";
                    A0g5[4] = "webSubPlatform_";
                    A0g5[5] = A7W.A00;
                    return A0B(AnonymousClass8ST.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", A0g5);
                case 3:
                    return new AnonymousClass8ST();
                case 4:
                    return new AnonymousClass8MF();
                case 5:
                    return AnonymousClass8ST.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0242 = AnonymousClass8ST.PARSER;
                    if (r0242 != null) {
                        return r0242;
                    }
                    synchronized (AnonymousClass8ST.class) {
                        r0112 = AnonymousClass8ST.PARSER;
                        if (r0112 == null) {
                            C201979ko r0243 = C21072A7j.A01;
                            r0112 = C90524aI.A0G(AnonymousClass8ST.DEFAULT_INSTANCE);
                            AnonymousClass8ST.PARSER = r0112;
                        }
                    }
                    return r0112;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173488Rw) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z8 = C90474aD.A1Z(12);
                    A1Z8[1] = "usesParticipantInKey_";
                    A1Z8[2] = "supportsStarredMessages_";
                    A1Z8[3] = "supportsDocumentMessages_";
                    A1Z8[4] = "supportsUrlMessages_";
                    A1Z8[5] = "supportsMediaRetry_";
                    A1Z8[6] = "supportsE2EImage_";
                    A1Z8[7] = "supportsE2EVideo_";
                    A1Z8[8] = "supportsE2EAudio_";
                    A1Z8[9] = "supportsE2EDocument_";
                    A1Z8[10] = "documentTypes_";
                    A1Z8[11] = "features_";
                    return A0B(C173488Rw.DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဈ\t\u000bည\n", A1Z8);
                case 3:
                    return new C173488Rw();
                case 4:
                    return new AnonymousClass8MG();
                case 5:
                    return C173488Rw.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0244 = C173488Rw.PARSER;
                    if (r0244 != null) {
                        return r0244;
                    }
                    synchronized (C173488Rw.class) {
                        r0111 = C173488Rw.PARSER;
                        if (r0111 == null) {
                            C201979ko r0245 = C21072A7j.A01;
                            r0111 = C90524aI.A0G(C173488Rw.DEFAULT_INSTANCE);
                            C173488Rw.PARSER = r0111;
                        }
                    }
                    return r0111;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8S6) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z9 = C90474aD.A1Z(19);
                    A1Z9[1] = "platform_";
                    A1Z9[2] = A7U.A00;
                    A1Z9[3] = "appVersion_";
                    A1Z9[4] = "mcc_";
                    A1Z9[5] = "mnc_";
                    A1Z9[6] = "osVersion_";
                    A1Z9[7] = "manufacturer_";
                    A1Z9[8] = "device_";
                    A1Z9[9] = "osBuildNumber_";
                    A1Z9[10] = "phoneId_";
                    A1Z9[11] = "releaseChannel_";
                    A1Z9[12] = A7V.A00;
                    A1Z9[13] = "localeLanguageIso6391_";
                    A1Z9[14] = "localeCountryIso31661Alpha2_";
                    A1Z9[15] = "deviceBoard_";
                    A1Z9[16] = "deviceExpId_";
                    A1Z9[17] = "deviceType_";
                    A1Z9[18] = A7T.A00;
                    return A0B(AnonymousClass8S6.DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဌ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဌ\u000e", A1Z9);
                case 3:
                    return new AnonymousClass8S6();
                case 4:
                    return new AnonymousClass8ME();
                case 5:
                    return AnonymousClass8S6.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0246 = AnonymousClass8S6.PARSER;
                    if (r0246 != null) {
                        return r0246;
                    }
                    synchronized (AnonymousClass8S6.class) {
                        r0110 = AnonymousClass8S6.PARSER;
                        if (r0110 == null) {
                            C201979ko r0247 = C21072A7j.A01;
                            r0110 = C90524aI.A0G(AnonymousClass8S6.DEFAULT_INSTANCE);
                            AnonymousClass8S6.PARSER = r0110;
                        }
                    }
                    return r0110;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RL) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g6 = A0g();
                    A0g6[1] = "primary_";
                    A0g6[2] = "secondary_";
                    A0g6[3] = "tertiary_";
                    A0g6[4] = "quaternary_";
                    A0g6[5] = "quinary_";
                    return A0B(AnonymousClass8RL.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A0g6);
                case 3:
                    return new AnonymousClass8RL();
                case 4:
                    return new AnonymousClass8MD();
                case 5:
                    return AnonymousClass8RL.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0248 = AnonymousClass8RL.PARSER;
                    if (r0248 != null) {
                        return r0248;
                    }
                    synchronized (AnonymousClass8RL.class) {
                        r0109 = AnonymousClass8RL.PARSER;
                        if (r0109 == null) {
                            C201979ko r0249 = C21072A7j.A01;
                            r0109 = C90524aI.A0G(AnonymousClass8RL.DEFAULT_INSTANCE);
                            AnonymousClass8RL.PARSER = r0109;
                        }
                    }
                    return r0109;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QL) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e10 = A0e();
                    A0e10[1] = "accountId_";
                    A0e10[2] = "integratorId_";
                    A0e10[3] = "token_";
                    return A0B(AnonymousClass8QL.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဋ\u0001\u0003ည\u0002", A0e10);
                case 3:
                    return new AnonymousClass8QL();
                case 4:
                    return new AnonymousClass8MC();
                case 5:
                    return AnonymousClass8QL.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0250 = AnonymousClass8QL.PARSER;
                    if (r0250 != null) {
                        return r0250;
                    }
                    synchronized (AnonymousClass8QL.class) {
                        r0108 = AnonymousClass8QL.PARSER;
                        if (r0108 == null) {
                            C201979ko r0251 = C21072A7j.A01;
                            r0108 = C90524aI.A0G(AnonymousClass8QL.DEFAULT_INSTANCE);
                            AnonymousClass8QL.PARSER = r0108;
                        }
                    }
                    return r0108;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173358Rj) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z10 = C90474aD.A1Z(9);
                    A1Z10[1] = "eRegid_";
                    A1Z10[2] = "eKeytype_";
                    A1Z10[3] = "eIdent_";
                    A1Z10[4] = "eSkeyId_";
                    A1Z10[5] = "eSkeyVal_";
                    A1Z10[6] = "eSkeySig_";
                    A1Z10[7] = "buildHash_";
                    A1Z10[8] = "deviceProps_";
                    return A0B(C173358Rj.DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007ည\u0006\bည\u0007", A1Z10);
                case 3:
                    return new C173358Rj();
                case 4:
                    return new AnonymousClass8MB();
                case 5:
                    return C173358Rj.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0252 = C173358Rj.PARSER;
                    if (r0252 != null) {
                        return r0252;
                    }
                    synchronized (C173358Rj.class) {
                        r0107 = C173358Rj.PARSER;
                        if (r0107 == null) {
                            C201979ko r0253 = C21072A7j.A01;
                            r0107 = C90524aI.A0G(C173358Rj.DEFAULT_INSTANCE);
                            C173358Rj.PARSER = r0107;
                        }
                    }
                    return r0107;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PV) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e11 = A0e();
                    A0e11[1] = "dnsMethod_";
                    A0e11[2] = A7Q.A00;
                    A0e11[3] = "appCached_";
                    return A0B(AnonymousClass8PV.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u000f\u0010\u0002\u0000\u0000\u0000\u000fဌ\u0000\u0010ဇ\u0001", A0e11);
                case 3:
                    return new AnonymousClass8PV();
                case 4:
                    return new AnonymousClass8MA();
                case 5:
                    return AnonymousClass8PV.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0254 = AnonymousClass8PV.PARSER;
                    if (r0254 != null) {
                        return r0254;
                    }
                    synchronized (AnonymousClass8PV.class) {
                        r0106 = AnonymousClass8PV.PARSER;
                        if (r0106 == null) {
                            C201979ko r0255 = C21072A7j.A01;
                            r0106 = C90524aI.A0G(AnonymousClass8PV.DEFAULT_INSTANCE);
                            AnonymousClass8PV.PARSER = r0106;
                        }
                    }
                    return r0106;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RK) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z11 = C90474aD.A1Z(7);
                    A1Z11[1] = "serial_";
                    A1Z11[2] = "issuer_";
                    A1Z11[3] = "verifiedName_";
                    A1Z11[4] = "localizedNames_";
                    A1Z11[5] = AnonymousClass8QK.class;
                    A1Z11[6] = "issueTime_";
                    return A0B(AnonymousClass8RK.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\b\u001b\nဃ\u0003", A1Z11);
                case 3:
                    return new AnonymousClass8RK();
                case 4:
                    return new AnonymousClass8M8();
                case 5:
                    return AnonymousClass8RK.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0256 = AnonymousClass8RK.PARSER;
                    if (r0256 != null) {
                        return r0256;
                    }
                    synchronized (AnonymousClass8RK.class) {
                        r0105 = AnonymousClass8RK.PARSER;
                        if (r0105 == null) {
                            C201979ko r0257 = C21072A7j.A01;
                            r0105 = C90524aI.A0G(AnonymousClass8RK.DEFAULT_INSTANCE);
                            AnonymousClass8RK.PARSER = r0105;
                        }
                    }
                    return r0105;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QK) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e12 = A0e();
                    A0e12[1] = "lg_";
                    A0e12[2] = "lc_";
                    A0e12[3] = "verifiedName_";
                    return A0B(AnonymousClass8QK.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", A0e12);
                case 3:
                    return new AnonymousClass8QK();
                case 4:
                    return new AnonymousClass8M6();
                case 5:
                    return AnonymousClass8QK.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0258 = AnonymousClass8QK.PARSER;
                    if (r0258 != null) {
                        return r0258;
                    }
                    synchronized (AnonymousClass8QK.class) {
                        r0104 = AnonymousClass8QK.PARSER;
                        if (r0104 == null) {
                            C201979ko r0259 = C21072A7j.A01;
                            r0104 = C90524aI.A0G(AnonymousClass8QK.DEFAULT_INSTANCE);
                            AnonymousClass8QK.PARSER = r0104;
                        }
                    }
                    return r0104;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173158Qp) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z12 = C90474aD.A1Z(8);
                    A1Z12[1] = "encoding_";
                    A1Z12[2] = A7M.A00;
                    A1Z12[3] = "transformer_";
                    A1Z12[4] = A7N.A00;
                    A1Z12[5] = "transformerArg_";
                    A1Z12[6] = AnonymousClass8PU.class;
                    A1Z12[7] = "transformedData_";
                    return A0B(C173158Qp.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004ည\u0002", A1Z12);
                case 3:
                    return new C173158Qp();
                case 4:
                    return new AnonymousClass8M3();
                case 5:
                    return C173158Qp.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0260 = C173158Qp.PARSER;
                    if (r0260 != null) {
                        return r0260;
                    }
                    synchronized (C173158Qp.class) {
                        r0103 = C173158Qp.PARSER;
                        if (r0103 == null) {
                            C201979ko r0261 = C21072A7j.A01;
                            r0103 = C90524aI.A0G(C173158Qp.DEFAULT_INSTANCE);
                            C173158Qp.PARSER = r0103;
                        }
                    }
                    return r0103;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PU) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d8 = A0d();
                    A0d8[1] = "key_";
                    A0d8[2] = "value_";
                    return A0B(AnonymousClass8PU.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", A0d8);
                case 3:
                    return new AnonymousClass8PU();
                case 4:
                    return new AnonymousClass8M4();
                case 5:
                    return AnonymousClass8PU.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0262 = AnonymousClass8PU.PARSER;
                    if (r0262 != null) {
                        return r0262;
                    }
                    synchronized (AnonymousClass8PU.class) {
                        r0102 = AnonymousClass8PU.PARSER;
                        if (r0102 == null) {
                            C201979ko r0263 = C21072A7j.A01;
                            r0102 = C90524aI.A0G(AnonymousClass8PU.DEFAULT_INSTANCE);
                            AnonymousClass8PU.PARSER = r0102;
                        }
                    }
                    return r0102;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PT) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Q2 = C36441kJ.A1Q();
                    A1Q2[0] = "value_";
                    A0Z(A1Q2, "valueCase_");
                    return A0B(AnonymousClass8PT.DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ွ\u0000\u0002ှ\u0000", A1Q2);
                case 3:
                    return new AnonymousClass8PT();
                case 4:
                    return new AnonymousClass8M5();
                case 5:
                    return AnonymousClass8PT.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0264 = AnonymousClass8PT.PARSER;
                    if (r0264 != null) {
                        return r0264;
                    }
                    synchronized (AnonymousClass8PT.class) {
                        r0101 = AnonymousClass8PT.PARSER;
                        if (r0101 == null) {
                            C201979ko r0265 = C21072A7j.A01;
                            r0101 = C90524aI.A0G(AnonymousClass8PT.DEFAULT_INSTANCE);
                            AnonymousClass8PT.PARSER = r0101;
                        }
                    }
                    return r0101;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8SS) {
            AnonymousClass8SS r24 = (AnonymousClass8SS) this;
            int i3 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r24.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i3 = 0;
                    }
                    r24.memoizedIsInitialized = (byte) i3;
                    return null;
                case 2:
                    return A0B(AnonymousClass8SS.DEFAULT_INSTANCE, "\u00010\u0000\u0002\u000150\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\u000bဉ\b\u000eဉ\t\u000fဉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012ဉ\r\u0013ဉ\u000e\u0014ဉ\u000f\u0015ဉ\u0010\u0016ဉ\u0011\u0017ဉ\u0012\u0018ဉ\u0013\u001aဉ\u0014\u001bဉ\u0015\u001cဉ\u0016\u001dဉ\u0017\u001eဉ\u0018\u001fဉ\u0019 ဉ\u001a!ဉ\u001b\"ဉ\u001c#ဉ\u001d$ဉ\u001e%ဉ\u001f&ဉ 'ဉ!(ဉ\")ဉ#*ဉ$+ဉ%,ဉ&-ဉ'.ဉ(/ဉ)0ဉ*1ᐉ+2ဉ,3ဉ-4ဉ.5ဉ/", new Object[]{"bitField0_", "bitField1_", "timestamp_", "starAction_", "contactAction_", "muteAction_", "pinAction_", "securityNotificationSetting_", "pushNameSetting_", "quickReplyAction_", "recentEmojiWeightsAction_", "labelEditAction_", "labelAssociationAction_", "localeSetting_", "archiveChatAction_", "deleteMessageForMeAction_", "keyExpiration_", "markChatAsReadAction_", "clearChatAction_", "deleteChatAction_", "unarchiveChatsSetting_", "primaryFeature_", "androidUnsupportedActions_", "agentAction_", "subscriptionAction_", "userStatusMuteAction_", "timeFormatAction_", "nuxAction_", "primaryVersionAction_", "stickerAction_", "removeRecentStickerAction_", "chatAssignment_", "chatAssignmentOpenedStatus_", "pnForLidChatAction_", "marketingMessageAction_", "marketingMessageBroadcastAction_", "externalWebBetaAction_", "privacySettingRelayAllCalls_", "callLogAction_", "ugcBot_", "statusPrivacy_", "botWelcomeRequestAction_", "deleteIndividualCallLog_", "labelReorderingAction_", "paymentInfoAction_", "customPaymentMethodsAction_", "lockChatAction_", "chatLockSettings_", "wamoUserIdentifierAction_", "privacySettingDisableLinkPreviewsAction_"});
                case 3:
                    return new AnonymousClass8SS();
                case 4:
                    return new AnonymousClass8LN();
                case 5:
                    return AnonymousClass8SS.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0266 = AnonymousClass8SS.PARSER;
                    if (r0266 != null) {
                        return r0266;
                    }
                    synchronized (AnonymousClass8SS.class) {
                        r0100 = AnonymousClass8SS.PARSER;
                        if (r0100 == null) {
                            C201979ko r0267 = C21072A7j.A01;
                            r0100 = C90524aI.A0G(AnonymousClass8SS.DEFAULT_INSTANCE);
                            AnonymousClass8SS.PARSER = r0100;
                        }
                    }
                    return r0100;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OU) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c7 = A0c();
                    A0c7[1] = "identifier_";
                    return A0B(AnonymousClass8OU.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A0c7);
                case 3:
                    return new AnonymousClass8OU();
                case 4:
                    return new AnonymousClass8M2();
                case 5:
                    return AnonymousClass8OU.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0268 = AnonymousClass8OU.PARSER;
                    if (r0268 != null) {
                        return r0268;
                    }
                    synchronized (AnonymousClass8OU.class) {
                        r099 = AnonymousClass8OU.PARSER;
                        if (r099 == null) {
                            C201979ko r0269 = C21072A7j.A01;
                            r099 = C90524aI.A0G(AnonymousClass8OU.DEFAULT_INSTANCE);
                            AnonymousClass8OU.PARSER = r099;
                        }
                    }
                    return r099;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OT) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c8 = A0c();
                    A0c8[1] = "muted_";
                    return A0B(AnonymousClass8OT.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c8);
                case 3:
                    return new AnonymousClass8OT();
                case 4:
                    return new AnonymousClass8M1();
                case 5:
                    return AnonymousClass8OT.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0270 = AnonymousClass8OT.PARSER;
                    if (r0270 != null) {
                        return r0270;
                    }
                    synchronized (AnonymousClass8OT.class) {
                        r098 = AnonymousClass8OT.PARSER;
                        if (r098 == null) {
                            C201979ko r0271 = C21072A7j.A01;
                            r098 = C90524aI.A0G(AnonymousClass8OT.DEFAULT_INSTANCE);
                            AnonymousClass8OT.PARSER = r098;
                        }
                    }
                    return r098;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OS) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c9 = A0c();
                    A0c9[1] = "unarchiveChats_";
                    return A0B(AnonymousClass8OS.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c9);
                case 3:
                    return new AnonymousClass8OS();
                case 4:
                    return new AnonymousClass8M0();
                case 5:
                    return AnonymousClass8OS.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0272 = AnonymousClass8OS.PARSER;
                    if (r0272 != null) {
                        return r0272;
                    }
                    synchronized (AnonymousClass8OS.class) {
                        r097 = AnonymousClass8OS.PARSER;
                        if (r097 == null) {
                            C201979ko r0273 = C21072A7j.A01;
                            r097 = C90524aI.A0G(AnonymousClass8OS.DEFAULT_INSTANCE);
                            AnonymousClass8OS.PARSER = r097;
                        }
                    }
                    return r097;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OR) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c10 = A0c();
                    A0c10[1] = "definition_";
                    return A0B(AnonymousClass8OR.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", A0c10);
                case 3:
                    return new AnonymousClass8OR();
                case 4:
                    return new C171958Lz();
                case 5:
                    return AnonymousClass8OR.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0274 = AnonymousClass8OR.PARSER;
                    if (r0274 != null) {
                        return r0274;
                    }
                    synchronized (AnonymousClass8OR.class) {
                        r096 = AnonymousClass8OR.PARSER;
                        if (r096 == null) {
                            C201979ko r0275 = C21072A7j.A01;
                            r096 = C90524aI.A0G(AnonymousClass8OR.DEFAULT_INSTANCE);
                            AnonymousClass8OR.PARSER = r096;
                        }
                    }
                    return r096;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OQ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c11 = A0c();
                    A0c11[1] = "isTwentyFourHourFormatEnabled_";
                    return A0B(AnonymousClass8OQ.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c11);
                case 3:
                    return new AnonymousClass8OQ();
                case 4:
                    return new C171948Ly();
                case 5:
                    return AnonymousClass8OQ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0276 = AnonymousClass8OQ.PARSER;
                    if (r0276 != null) {
                        return r0276;
                    }
                    synchronized (AnonymousClass8OQ.class) {
                        r095 = AnonymousClass8OQ.PARSER;
                        if (r095 == null) {
                            C201979ko r0277 = C21072A7j.A01;
                            r095 = C90524aI.A0G(AnonymousClass8OQ.DEFAULT_INSTANCE);
                            AnonymousClass8OQ.PARSER = r095;
                        }
                    }
                    return r095;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QJ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f7 = A0f();
                    A0f7[1] = "lastMessageTimestamp_";
                    A0f7[2] = "lastSystemMessageTimestamp_";
                    A0f7[3] = "messages_";
                    A0f7[4] = AnonymousClass8PS.class;
                    return A0B(AnonymousClass8QJ.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", A0f7);
                case 3:
                    return new AnonymousClass8QJ();
                case 4:
                    return new C172198Mx();
                case 5:
                    return AnonymousClass8QJ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0278 = AnonymousClass8QJ.PARSER;
                    if (r0278 != null) {
                        return r0278;
                    }
                    synchronized (AnonymousClass8QJ.class) {
                        r094 = AnonymousClass8QJ.PARSER;
                        if (r094 == null) {
                            C201979ko r0279 = C21072A7j.A01;
                            r094 = C90524aI.A0G(AnonymousClass8QJ.DEFAULT_INSTANCE);
                            AnonymousClass8QJ.PARSER = r094;
                        }
                    }
                    return r094;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PS) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d9 = A0d();
                    A0d9[1] = "key_";
                    A0d9[2] = "timestamp_";
                    return A0B(AnonymousClass8PS.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", A0d9);
                case 3:
                    return new AnonymousClass8PS();
                case 4:
                    return new C171938Lx();
                case 5:
                    return AnonymousClass8PS.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0280 = AnonymousClass8PS.PARSER;
                    if (r0280 != null) {
                        return r0280;
                    }
                    synchronized (AnonymousClass8PS.class) {
                        r093 = AnonymousClass8PS.PARSER;
                        if (r093 == null) {
                            C201979ko r0281 = C21072A7j.A01;
                            r093 = C90524aI.A0G(AnonymousClass8PS.DEFAULT_INSTANCE);
                            AnonymousClass8PS.PARSER = r093;
                        }
                    }
                    return r093;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QI) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e13 = A0e();
                    A0e13[1] = "isDeactivated_";
                    A0e13[2] = "isAutoRenewing_";
                    A0e13[3] = "expirationDate_";
                    return A0B(AnonymousClass8QI.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", A0e13);
                case 3:
                    return new AnonymousClass8QI();
                case 4:
                    return new C171928Lw();
                case 5:
                    return AnonymousClass8QI.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0282 = AnonymousClass8QI.PARSER;
                    if (r0282 != null) {
                        return r0282;
                    }
                    synchronized (AnonymousClass8QI.class) {
                        r092 = AnonymousClass8QI.PARSER;
                        if (r092 == null) {
                            C201979ko r0283 = C21072A7j.A01;
                            r092 = C90524aI.A0G(AnonymousClass8QI.DEFAULT_INSTANCE);
                            AnonymousClass8QI.PARSER = r092;
                        }
                    }
                    return r092;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PR) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e14 = A0e();
                    A0e14[1] = "mode_";
                    A0e14[2] = A7L.A00;
                    A0e14[3] = "userJid_";
                    return A0B(AnonymousClass8PR.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", A0e14);
                case 3:
                    return new AnonymousClass8PR();
                case 4:
                    return new C171918Lv();
                case 5:
                    return AnonymousClass8PR.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0284 = AnonymousClass8PR.PARSER;
                    if (r0284 != null) {
                        return r0284;
                    }
                    synchronized (AnonymousClass8PR.class) {
                        r091 = AnonymousClass8PR.PARSER;
                        if (r091 == null) {
                            C201979ko r0285 = C21072A7j.A01;
                            r091 = C90524aI.A0G(AnonymousClass8PR.DEFAULT_INSTANCE);
                            AnonymousClass8PR.PARSER = r091;
                        }
                    }
                    return r091;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OP) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c12 = A0c();
                    A0c12[1] = "starred_";
                    return A0B(AnonymousClass8OP.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c12);
                case 3:
                    return new AnonymousClass8OP();
                case 4:
                    return new C171908Lu();
                case 5:
                    return AnonymousClass8OP.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0286 = AnonymousClass8OP.PARSER;
                    if (r0286 != null) {
                        return r0286;
                    }
                    synchronized (AnonymousClass8OP.class) {
                        r090 = AnonymousClass8OP.PARSER;
                        if (r090 == null) {
                            C201979ko r0287 = C21072A7j.A01;
                            r090 = C90524aI.A0G(AnonymousClass8OP.DEFAULT_INSTANCE);
                            AnonymousClass8OP.PARSER = r090;
                        }
                    }
                    return r090;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OO) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c13 = A0c();
                    A0c13[1] = "showNotification_";
                    return A0B(AnonymousClass8OO.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c13);
                case 3:
                    return new AnonymousClass8OO();
                case 4:
                    return new C171898Lt();
                case 5:
                    return AnonymousClass8OO.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0288 = AnonymousClass8OO.PARSER;
                    if (r0288 != null) {
                        return r0288;
                    }
                    synchronized (AnonymousClass8OO.class) {
                        r089 = AnonymousClass8OO.PARSER;
                        if (r089 == null) {
                            C201979ko r0289 = C21072A7j.A01;
                            r089 = C90524aI.A0G(AnonymousClass8OO.DEFAULT_INSTANCE);
                            AnonymousClass8OO.PARSER = r089;
                        }
                    }
                    return r089;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8ON) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c14 = A0c();
                    A0c14[1] = "lastStickerSentTs_";
                    return A0B(AnonymousClass8ON.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", A0c14);
                case 3:
                    return new AnonymousClass8ON();
                case 4:
                    return new C171888Ls();
                case 5:
                    return AnonymousClass8ON.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0290 = AnonymousClass8ON.PARSER;
                    if (r0290 != null) {
                        return r0290;
                    }
                    synchronized (AnonymousClass8ON.class) {
                        r088 = AnonymousClass8ON.PARSER;
                        if (r088 == null) {
                            C201979ko r0291 = C21072A7j.A01;
                            r088 = C90524aI.A0G(AnonymousClass8ON.DEFAULT_INSTANCE);
                            AnonymousClass8ON.PARSER = r088;
                        }
                    }
                    return r088;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172238Nb) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0M3 = AnonymousClass001.A0M();
                    A0M3[0] = "weights_";
                    A0M3[1] = AnonymousClass8PM.class;
                    return A0B(C172238Nb.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A0M3);
                case 3:
                    return new C172238Nb();
                case 4:
                    return new C171878Lr();
                case 5:
                    return C172238Nb.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0292 = C172238Nb.PARSER;
                    if (r0292 != null) {
                        return r0292;
                    }
                    synchronized (C172238Nb.class) {
                        r087 = C172238Nb.PARSER;
                        if (r087 == null) {
                            C201979ko r0293 = C21072A7j.A01;
                            r087 = C90524aI.A0G(C172238Nb.DEFAULT_INSTANCE);
                            C172238Nb.PARSER = r087;
                        }
                    }
                    return r087;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RJ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g7 = A0g();
                    A0g7[1] = "shortcut_";
                    A0g7[2] = "message_";
                    A0g7[3] = "keywords_";
                    A0g7[4] = "count_";
                    A0g7[5] = "deleted_";
                    return A0B(AnonymousClass8RJ.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004င\u0002\u0005ဇ\u0003", A0g7);
                case 3:
                    return new AnonymousClass8RJ();
                case 4:
                    return new C171868Lq();
                case 5:
                    return AnonymousClass8RJ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0294 = AnonymousClass8RJ.PARSER;
                    if (r0294 != null) {
                        return r0294;
                    }
                    synchronized (AnonymousClass8RJ.class) {
                        r086 = AnonymousClass8RJ.PARSER;
                        if (r086 == null) {
                            C201979ko r0295 = C21072A7j.A01;
                            r086 = C90524aI.A0G(AnonymousClass8RJ.DEFAULT_INSTANCE);
                            AnonymousClass8RJ.PARSER = r086;
                        }
                    }
                    return r086;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OM) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c15 = A0c();
                    A0c15[1] = "name_";
                    return A0B(AnonymousClass8OM.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A0c15);
                case 3:
                    return new AnonymousClass8OM();
                case 4:
                    return new C171858Lp();
                case 5:
                    return AnonymousClass8OM.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0296 = AnonymousClass8OM.PARSER;
                    if (r0296 != null) {
                        return r0296;
                    }
                    synchronized (AnonymousClass8OM.class) {
                        r085 = AnonymousClass8OM.PARSER;
                        if (r085 == null) {
                            C201979ko r0297 = C21072A7j.A01;
                            r085 = C90524aI.A0G(AnonymousClass8OM.DEFAULT_INSTANCE);
                            AnonymousClass8OM.PARSER = r085;
                        }
                    }
                    return r085;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OL) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c16 = A0c();
                    A0c16[1] = "isEnabled_";
                    return A0B(AnonymousClass8OL.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c16);
                case 3:
                    return new AnonymousClass8OL();
                case 4:
                    return new C171848Lo();
                case 5:
                    return AnonymousClass8OL.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0298 = AnonymousClass8OL.PARSER;
                    if (r0298 != null) {
                        return r0298;
                    }
                    synchronized (AnonymousClass8OL.class) {
                        r084 = AnonymousClass8OL.PARSER;
                        if (r084 == null) {
                            C201979ko r0299 = C21072A7j.A01;
                            r084 = C90524aI.A0G(AnonymousClass8OL.DEFAULT_INSTANCE);
                            AnonymousClass8OL.PARSER = r084;
                        }
                    }
                    return r084;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OK) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c17 = A0c();
                    A0c17[1] = "isPreviewsDisabled_";
                    return A0B(AnonymousClass8OK.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c17);
                case 3:
                    return new AnonymousClass8OK();
                case 4:
                    return new C171838Ln();
                case 5:
                    return AnonymousClass8OK.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0300 = AnonymousClass8OK.PARSER;
                    if (r0300 != null) {
                        return r0300;
                    }
                    synchronized (AnonymousClass8OK.class) {
                        r083 = AnonymousClass8OK.PARSER;
                        if (r083 == null) {
                            C201979ko r0301 = C21072A7j.A01;
                            r083 = C90524aI.A0G(AnonymousClass8OK.DEFAULT_INSTANCE);
                            AnonymousClass8OK.PARSER = r083;
                        }
                    }
                    return r083;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172228Na) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0B(C172228Na.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"flags_"});
                case 3:
                    return new C172228Na();
                case 4:
                    return new C171828Lm();
                case 5:
                    return C172228Na.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0302 = C172228Na.PARSER;
                    if (r0302 != null) {
                        return r0302;
                    }
                    synchronized (C172228Na.class) {
                        r082 = C172228Na.PARSER;
                        if (r082 == null) {
                            C201979ko r0303 = C21072A7j.A01;
                            r082 = C90524aI.A0G(C172228Na.DEFAULT_INSTANCE);
                            C172228Na.PARSER = r082;
                        }
                    }
                    return r082;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OJ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c18 = A0c();
                    A0c18[1] = "pnJid_";
                    return A0B(AnonymousClass8OJ.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A0c18);
                case 3:
                    return new AnonymousClass8OJ();
                case 4:
                    return new C171818Ll();
                case 5:
                    return AnonymousClass8OJ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0304 = AnonymousClass8OJ.PARSER;
                    if (r0304 != null) {
                        return r0304;
                    }
                    synchronized (AnonymousClass8OJ.class) {
                        r081 = AnonymousClass8OJ.PARSER;
                        if (r081 == null) {
                            C201979ko r0305 = C21072A7j.A01;
                            r081 = C90524aI.A0G(AnonymousClass8OJ.DEFAULT_INSTANCE);
                            AnonymousClass8OJ.PARSER = r081;
                        }
                    }
                    return r081;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OI) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c19 = A0c();
                    A0c19[1] = "pinned_";
                    return A0B(AnonymousClass8OI.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c19);
                case 3:
                    return new AnonymousClass8OI();
                case 4:
                    return new C171808Lk();
                case 5:
                    return AnonymousClass8OI.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0306 = AnonymousClass8OI.PARSER;
                    if (r0306 != null) {
                        return r0306;
                    }
                    synchronized (AnonymousClass8OI.class) {
                        r080 = AnonymousClass8OI.PARSER;
                        if (r080 == null) {
                            C201979ko r0307 = C21072A7j.A01;
                            r080 = C90524aI.A0G(AnonymousClass8OI.DEFAULT_INSTANCE);
                            AnonymousClass8OI.PARSER = r080;
                        }
                    }
                    return r080;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OH) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c20 = A0c();
                    A0c20[1] = "cpi_";
                    return A0B(AnonymousClass8OH.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A0c20);
                case 3:
                    return new AnonymousClass8OH();
                case 4:
                    return new C171798Lj();
                case 5:
                    return AnonymousClass8OH.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0308 = AnonymousClass8OH.PARSER;
                    if (r0308 != null) {
                        return r0308;
                    }
                    synchronized (AnonymousClass8OH.class) {
                        r079 = AnonymousClass8OH.PARSER;
                        if (r079 == null) {
                            C201979ko r0309 = C21072A7j.A01;
                            r079 = C90524aI.A0G(AnonymousClass8OH.DEFAULT_INSTANCE);
                            AnonymousClass8OH.PARSER = r079;
                        }
                    }
                    return r079;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OG) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c21 = A0c();
                    A0c21[1] = "acknowledged_";
                    return A0B(AnonymousClass8OG.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c21);
                case 3:
                    return new AnonymousClass8OG();
                case 4:
                    return new C171788Li();
                case 5:
                    return AnonymousClass8OG.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0310 = AnonymousClass8OG.PARSER;
                    if (r0310 != null) {
                        return r0310;
                    }
                    synchronized (AnonymousClass8OG.class) {
                        r078 = AnonymousClass8OG.PARSER;
                        if (r078 == null) {
                            C201979ko r0311 = C21072A7j.A01;
                            r078 = C90524aI.A0G(AnonymousClass8OG.DEFAULT_INSTANCE);
                            AnonymousClass8OG.PARSER = r078;
                        }
                    }
                    return r078;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QH) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e15 = A0e();
                    A0e15[1] = "muted_";
                    A0e15[2] = "muteEndTimestamp_";
                    A0e15[3] = "autoMuted_";
                    return A0B(AnonymousClass8QH.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", A0e15);
                case 3:
                    return new AnonymousClass8QH();
                case 4:
                    return new C171778Lh();
                case 5:
                    return AnonymousClass8QH.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0312 = AnonymousClass8QH.PARSER;
                    if (r0312 != null) {
                        return r0312;
                    }
                    synchronized (AnonymousClass8QH.class) {
                        r077 = AnonymousClass8QH.PARSER;
                        if (r077 == null) {
                            C201979ko r0313 = C21072A7j.A01;
                            r077 = C90524aI.A0G(AnonymousClass8QH.DEFAULT_INSTANCE);
                            AnonymousClass8QH.PARSER = r077;
                        }
                    }
                    return r077;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OF) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c22 = A0c();
                    A0c22[1] = "repliedCount_";
                    return A0B(AnonymousClass8OF.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", A0c22);
                case 3:
                    return new AnonymousClass8OF();
                case 4:
                    return new C171768Lg();
                case 5:
                    return AnonymousClass8OF.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0314 = AnonymousClass8OF.PARSER;
                    if (r0314 != null) {
                        return r0314;
                    }
                    synchronized (AnonymousClass8OF.class) {
                        r076 = AnonymousClass8OF.PARSER;
                        if (r076 == null) {
                            C201979ko r0315 = C21072A7j.A01;
                            r076 = C90524aI.A0G(AnonymousClass8OF.DEFAULT_INSTANCE);
                            AnonymousClass8OF.PARSER = r076;
                        }
                    }
                    return r076;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173278Rb) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z13 = C90474aD.A1Z(9);
                    A1Z13[1] = "name_";
                    A1Z13[2] = "message_";
                    A1Z13[3] = "type_";
                    A1Z13[4] = A7K.A00;
                    A1Z13[5] = "createdAt_";
                    A1Z13[6] = "lastSentAt_";
                    A1Z13[7] = "isDeleted_";
                    A1Z13[8] = "mediaId_";
                    return A0B(C173278Rb.DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", A1Z13);
                case 3:
                    return new C173278Rb();
                case 4:
                    return new C171758Lf();
                case 5:
                    return C173278Rb.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0316 = C173278Rb.PARSER;
                    if (r0316 != null) {
                        return r0316;
                    }
                    synchronized (C173278Rb.class) {
                        r075 = C173278Rb.PARSER;
                        if (r075 == null) {
                            C201979ko r0317 = C21072A7j.A01;
                            r075 = C90524aI.A0G(C173278Rb.DEFAULT_INSTANCE);
                            C173278Rb.PARSER = r075;
                        }
                    }
                    return r075;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PQ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d10 = A0d();
                    A0d10[1] = "read_";
                    A0d10[2] = "messageRange_";
                    return A0B(AnonymousClass8PQ.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", A0d10);
                case 3:
                    return new AnonymousClass8PQ();
                case 4:
                    return new C171748Le();
                case 5:
                    return AnonymousClass8PQ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0318 = AnonymousClass8PQ.PARSER;
                    if (r0318 != null) {
                        return r0318;
                    }
                    synchronized (AnonymousClass8PQ.class) {
                        r074 = AnonymousClass8PQ.PARSER;
                        if (r074 == null) {
                            C201979ko r0319 = C21072A7j.A01;
                            r074 = C90524aI.A0G(AnonymousClass8PQ.DEFAULT_INSTANCE);
                            AnonymousClass8PQ.PARSER = r074;
                        }
                    }
                    return r074;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OE) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c23 = A0c();
                    A0c23[1] = "locked_";
                    return A0B(AnonymousClass8OE.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c23);
                case 3:
                    return new AnonymousClass8OE();
                case 4:
                    return new C171738Ld();
                case 5:
                    return AnonymousClass8OE.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0320 = AnonymousClass8OE.PARSER;
                    if (r0320 != null) {
                        return r0320;
                    }
                    synchronized (AnonymousClass8OE.class) {
                        r073 = AnonymousClass8OE.PARSER;
                        if (r073 == null) {
                            C201979ko r0321 = C21072A7j.A01;
                            r073 = C90524aI.A0G(AnonymousClass8OE.DEFAULT_INSTANCE);
                            AnonymousClass8OE.PARSER = r073;
                        }
                    }
                    return r073;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8NZ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0B(AnonymousClass8NZ.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"sortedLabelIds_"});
                case 3:
                    return new AnonymousClass8NZ();
                case 4:
                    return new C171728Lc();
                case 5:
                    return AnonymousClass8NZ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0322 = AnonymousClass8NZ.PARSER;
                    if (r0322 != null) {
                        return r0322;
                    }
                    synchronized (AnonymousClass8NZ.class) {
                        r072 = AnonymousClass8NZ.PARSER;
                        if (r072 == null) {
                            C201979ko r0323 = C21072A7j.A01;
                            r072 = C90524aI.A0G(AnonymousClass8NZ.DEFAULT_INSTANCE);
                            AnonymousClass8NZ.PARSER = r072;
                        }
                    }
                    return r072;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RI) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g8 = A0g();
                    A0g8[1] = "name_";
                    A0g8[2] = "color_";
                    A0g8[3] = "predefinedId_";
                    A0g8[4] = "deleted_";
                    A0g8[5] = "orderIndex_";
                    return A0B(AnonymousClass8RI.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004", A0g8);
                case 3:
                    return new AnonymousClass8RI();
                case 4:
                    return new C171718Lb();
                case 5:
                    return AnonymousClass8RI.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0324 = AnonymousClass8RI.PARSER;
                    if (r0324 != null) {
                        return r0324;
                    }
                    synchronized (AnonymousClass8RI.class) {
                        r071 = AnonymousClass8RI.PARSER;
                        if (r071 == null) {
                            C201979ko r0325 = C21072A7j.A01;
                            r071 = C90524aI.A0G(AnonymousClass8RI.DEFAULT_INSTANCE);
                            AnonymousClass8RI.PARSER = r071;
                        }
                    }
                    return r071;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OD) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c24 = A0c();
                    A0c24[1] = "labeled_";
                    return A0B(AnonymousClass8OD.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c24);
                case 3:
                    return new AnonymousClass8OD();
                case 4:
                    return new C171708La();
                case 5:
                    return AnonymousClass8OD.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0326 = AnonymousClass8OD.PARSER;
                    if (r0326 != null) {
                        return r0326;
                    }
                    synchronized (AnonymousClass8OD.class) {
                        r070 = AnonymousClass8OD.PARSER;
                        if (r070 == null) {
                            C201979ko r0327 = C21072A7j.A01;
                            r070 = C90524aI.A0G(AnonymousClass8OD.DEFAULT_INSTANCE);
                            AnonymousClass8OD.PARSER = r070;
                        }
                    }
                    return r070;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OC) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c25 = A0c();
                    A0c25[1] = "expiredKeyEpoch_";
                    return A0B(AnonymousClass8OC.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", A0c25);
                case 3:
                    return new AnonymousClass8OC();
                case 4:
                    return new AnonymousClass8LZ();
                case 5:
                    return AnonymousClass8OC.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0328 = AnonymousClass8OC.PARSER;
                    if (r0328 != null) {
                        return r0328;
                    }
                    synchronized (AnonymousClass8OC.class) {
                        r069 = AnonymousClass8OC.PARSER;
                        if (r069 == null) {
                            C201979ko r0329 = C21072A7j.A01;
                            r069 = C90524aI.A0G(AnonymousClass8OC.DEFAULT_INSTANCE);
                            AnonymousClass8OC.PARSER = r069;
                        }
                    }
                    return r069;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OB) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c26 = A0c();
                    A0c26[1] = "isOptIn_";
                    return A0B(AnonymousClass8OB.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c26);
                case 3:
                    return new AnonymousClass8OB();
                case 4:
                    return new AnonymousClass8LY();
                case 5:
                    return AnonymousClass8OB.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0330 = AnonymousClass8OB.PARSER;
                    if (r0330 != null) {
                        return r0330;
                    }
                    synchronized (AnonymousClass8OB.class) {
                        r068 = AnonymousClass8OB.PARSER;
                        if (r068 == null) {
                            C201979ko r0331 = C21072A7j.A01;
                            r068 = C90524aI.A0G(AnonymousClass8OB.DEFAULT_INSTANCE);
                            AnonymousClass8OB.PARSER = r068;
                        }
                    }
                    return r068;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PP) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d11 = A0d();
                    A0d11[1] = "deleteMedia_";
                    A0d11[2] = "messageTimestamp_";
                    return A0B(AnonymousClass8PP.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001", A0d11);
                case 3:
                    return new AnonymousClass8PP();
                case 4:
                    return new AnonymousClass8LX();
                case 5:
                    return AnonymousClass8PP.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0332 = AnonymousClass8PP.PARSER;
                    if (r0332 != null) {
                        return r0332;
                    }
                    synchronized (AnonymousClass8PP.class) {
                        r067 = AnonymousClass8PP.PARSER;
                        if (r067 == null) {
                            C201979ko r0333 = C21072A7j.A01;
                            r067 = C90524aI.A0G(AnonymousClass8PP.DEFAULT_INSTANCE);
                            AnonymousClass8PP.PARSER = r067;
                        }
                    }
                    return r067;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PO) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d12 = A0d();
                    A0d12[1] = "peerJid_";
                    A0d12[2] = "isIncoming_";
                    return A0B(AnonymousClass8PO.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", A0d12);
                case 3:
                    return new AnonymousClass8PO();
                case 4:
                    return new AnonymousClass8LW();
                case 5:
                    return AnonymousClass8PO.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0334 = AnonymousClass8PO.PARSER;
                    if (r0334 != null) {
                        return r0334;
                    }
                    synchronized (AnonymousClass8PO.class) {
                        r066 = AnonymousClass8PO.PARSER;
                        if (r066 == null) {
                            C201979ko r0335 = C21072A7j.A01;
                            r066 = C90524aI.A0G(AnonymousClass8PO.DEFAULT_INSTANCE);
                            AnonymousClass8PO.PARSER = r066;
                        }
                    }
                    return r066;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8OA) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c27 = A0c();
                    A0c27[1] = "messageRange_";
                    return A0B(AnonymousClass8OA.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", A0c27);
                case 3:
                    return new AnonymousClass8OA();
                case 4:
                    return new AnonymousClass8LV();
                case 5:
                    return AnonymousClass8OA.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0336 = AnonymousClass8OA.PARSER;
                    if (r0336 != null) {
                        return r0336;
                    }
                    synchronized (AnonymousClass8OA.class) {
                        r065 = AnonymousClass8OA.PARSER;
                        if (r065 == null) {
                            C201979ko r0337 = C21072A7j.A01;
                            r065 = C90524aI.A0G(AnonymousClass8OA.DEFAULT_INSTANCE);
                            AnonymousClass8OA.PARSER = r065;
                        }
                    }
                    return r065;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O9) {
            AnonymousClass8O9 r25 = (AnonymousClass8O9) this;
            int i4 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r25.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i4 = 0;
                    }
                    r25.memoizedIsInitialized = (byte) i4;
                    return null;
                case 2:
                    Object[] A0M4 = AnonymousClass001.A0M();
                    A0M4[0] = "customPaymentMethods_";
                    A0M4[1] = AnonymousClass8R4.class;
                    return A0B(AnonymousClass8O9.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", A0M4);
                case 3:
                    return new AnonymousClass8O9();
                case 4:
                    return new AnonymousClass8LU();
                case 5:
                    return AnonymousClass8O9.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0338 = AnonymousClass8O9.PARSER;
                    if (r0338 != null) {
                        return r0338;
                    }
                    synchronized (AnonymousClass8O9.class) {
                        r064 = AnonymousClass8O9.PARSER;
                        if (r064 == null) {
                            C201979ko r0339 = C21072A7j.A01;
                            r064 = C90524aI.A0G(AnonymousClass8O9.DEFAULT_INSTANCE);
                            AnonymousClass8O9.PARSER = r064;
                        }
                    }
                    return r064;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172868Pm) {
            C172868Pm r26 = (C172868Pm) this;
            int i5 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r26.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i5 = 0;
                    }
                    r26.memoizedIsInitialized = (byte) i5;
                    return null;
                case 2:
                    Object[] A1Q3 = C36441kJ.A1Q();
                    A1Q3[0] = "bitField0_";
                    A1Q3[1] = "key_";
                    A1Q3[2] = "value_";
                    return A0B(C172868Pm.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", A1Q3);
                case 3:
                    return new C172868Pm();
                case 4:
                    return new AnonymousClass8LT();
                case 5:
                    return C172868Pm.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0340 = C172868Pm.PARSER;
                    if (r0340 != null) {
                        return r0340;
                    }
                    synchronized (C172868Pm.class) {
                        r063 = C172868Pm.PARSER;
                        if (r063 == null) {
                            C201979ko r0341 = C21072A7j.A01;
                            r063 = C90524aI.A0G(C172868Pm.DEFAULT_INSTANCE);
                            C172868Pm.PARSER = r063;
                        }
                    }
                    return r063;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8R4) {
            AnonymousClass8R4 r27 = (AnonymousClass8R4) this;
            int i6 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r27.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i6 = 0;
                    }
                    r27.memoizedIsInitialized = (byte) i6;
                    return null;
                case 2:
                    return A0B(AnonymousClass8R4.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004Л", new Object[]{"bitField0_", "credentialId_", "country_", "type_", "metadata_", C172868Pm.class});
                case 3:
                    return new AnonymousClass8R4();
                case 4:
                    return new AnonymousClass8LS();
                case 5:
                    return AnonymousClass8R4.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0342 = AnonymousClass8R4.PARSER;
                    if (r0342 != null) {
                        return r0342;
                    }
                    synchronized (AnonymousClass8R4.class) {
                        r062 = AnonymousClass8R4.PARSER;
                        if (r062 == null) {
                            C201979ko r0343 = C21072A7j.A01;
                            r062 = C90524aI.A0G(AnonymousClass8R4.DEFAULT_INSTANCE);
                            AnonymousClass8R4.PARSER = r062;
                        }
                    }
                    return r062;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173148Qo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f8 = A0f();
                    A0f8[1] = "fullName_";
                    A0f8[2] = "firstName_";
                    A0f8[3] = "lidJid_";
                    A0f8[4] = "saveOnPrimaryAddressbook_";
                    return A0B(C173148Qo.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", A0f8);
                case 3:
                    return new C173148Qo();
                case 4:
                    return new AnonymousClass8LR();
                case 5:
                    return C173148Qo.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0344 = C173148Qo.PARSER;
                    if (r0344 != null) {
                        return r0344;
                    }
                    synchronized (C173148Qo.class) {
                        r061 = C173148Qo.PARSER;
                        if (r061 == null) {
                            C201979ko r0345 = C21072A7j.A01;
                            r061 = C90524aI.A0G(C173148Qo.DEFAULT_INSTANCE);
                            C173148Qo.PARSER = r061;
                        }
                    }
                    return r061;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O8) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c28 = A0c();
                    A0c28[1] = "messageRange_";
                    return A0B(AnonymousClass8O8.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", A0c28);
                case 3:
                    return new AnonymousClass8O8();
                case 4:
                    return new AnonymousClass8LQ();
                case 5:
                    return AnonymousClass8O8.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0346 = AnonymousClass8O8.PARSER;
                    if (r0346 != null) {
                        return r0346;
                    }
                    synchronized (AnonymousClass8O8.class) {
                        r060 = AnonymousClass8O8.PARSER;
                        if (r060 == null) {
                            C201979ko r0347 = C21072A7j.A01;
                            r060 = C90524aI.A0G(AnonymousClass8O8.DEFAULT_INSTANCE);
                            AnonymousClass8O8.PARSER = r060;
                        }
                    }
                    return r060;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O7) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c29 = A0c();
                    A0c29[1] = "chatOpened_";
                    return A0B(AnonymousClass8O7.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c29);
                case 3:
                    return new AnonymousClass8O7();
                case 4:
                    return new AnonymousClass8LP();
                case 5:
                    return AnonymousClass8O7.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0348 = AnonymousClass8O7.PARSER;
                    if (r0348 != null) {
                        return r0348;
                    }
                    synchronized (AnonymousClass8O7.class) {
                        r059 = AnonymousClass8O7.PARSER;
                        if (r059 == null) {
                            C201979ko r0349 = C21072A7j.A01;
                            r059 = C90524aI.A0G(AnonymousClass8O7.DEFAULT_INSTANCE);
                            AnonymousClass8O7.PARSER = r059;
                        }
                    }
                    return r059;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O6) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c30 = A0c();
                    A0c30[1] = "deviceAgentID_";
                    return A0B(AnonymousClass8O6.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A0c30);
                case 3:
                    return new AnonymousClass8O6();
                case 4:
                    return new AnonymousClass8LO();
                case 5:
                    return AnonymousClass8O6.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0350 = AnonymousClass8O6.PARSER;
                    if (r0350 != null) {
                        return r0350;
                    }
                    synchronized (AnonymousClass8O6.class) {
                        r058 = AnonymousClass8O6.PARSER;
                        if (r058 == null) {
                            C201979ko r0351 = C21072A7j.A01;
                            r058 = C90524aI.A0G(AnonymousClass8O6.DEFAULT_INSTANCE);
                            AnonymousClass8O6.PARSER = r058;
                        }
                    }
                    return r058;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O5) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c31 = A0c();
                    A0c31[1] = "isSent_";
                    return A0B(AnonymousClass8O5.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c31);
                case 3:
                    return new AnonymousClass8O5();
                case 4:
                    return new AnonymousClass8LM();
                case 5:
                    return AnonymousClass8O5.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0352 = AnonymousClass8O5.PARSER;
                    if (r0352 != null) {
                        return r0352;
                    }
                    synchronized (AnonymousClass8O5.class) {
                        r057 = AnonymousClass8O5.PARSER;
                        if (r057 == null) {
                            C201979ko r0353 = C21072A7j.A01;
                            r057 = C90524aI.A0G(AnonymousClass8O5.DEFAULT_INSTANCE);
                            AnonymousClass8O5.PARSER = r057;
                        }
                    }
                    return r057;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PN) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d13 = A0d();
                    A0d13[1] = "archived_";
                    A0d13[2] = "messageRange_";
                    return A0B(AnonymousClass8PN.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", A0d13);
                case 3:
                    return new AnonymousClass8PN();
                case 4:
                    return new AnonymousClass8LL();
                case 5:
                    return AnonymousClass8PN.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0354 = AnonymousClass8PN.PARSER;
                    if (r0354 != null) {
                        return r0354;
                    }
                    synchronized (AnonymousClass8PN.class) {
                        r056 = AnonymousClass8PN.PARSER;
                        if (r056 == null) {
                            C201979ko r0355 = C21072A7j.A01;
                            r056 = C90524aI.A0G(AnonymousClass8PN.DEFAULT_INSTANCE);
                            AnonymousClass8PN.PARSER = r056;
                        }
                    }
                    return r056;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O4) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c32 = A0c();
                    A0c32[1] = "allowed_";
                    return A0B(AnonymousClass8O4.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A0c32);
                case 3:
                    return new AnonymousClass8O4();
                case 4:
                    return new AnonymousClass8LK();
                case 5:
                    return AnonymousClass8O4.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0356 = AnonymousClass8O4.PARSER;
                    if (r0356 != null) {
                        return r0356;
                    }
                    synchronized (AnonymousClass8O4.class) {
                        r055 = AnonymousClass8O4.PARSER;
                        if (r055 == null) {
                            C201979ko r0357 = C21072A7j.A01;
                            r055 = C90524aI.A0G(AnonymousClass8O4.DEFAULT_INSTANCE);
                            AnonymousClass8O4.PARSER = r055;
                        }
                    }
                    return r055;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QG) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e16 = A0e();
                    A0e16[1] = "name_";
                    A0e16[2] = "deviceID_";
                    A0e16[3] = "isDeleted_";
                    return A0B(AnonymousClass8QG.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002", A0e16);
                case 3:
                    return new AnonymousClass8QG();
                case 4:
                    return new AnonymousClass8LJ();
                case 5:
                    return AnonymousClass8QG.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0358 = AnonymousClass8QG.PARSER;
                    if (r0358 != null) {
                        return r0358;
                    }
                    synchronized (AnonymousClass8QG.class) {
                        r054 = AnonymousClass8QG.PARSER;
                        if (r054 == null) {
                            C201979ko r0359 = C21072A7j.A01;
                            r054 = C90524aI.A0G(AnonymousClass8QG.DEFAULT_INSTANCE);
                            AnonymousClass8QG.PARSER = r054;
                        }
                    }
                    return r054;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8R3) {
            AnonymousClass8R3 r28 = (AnonymousClass8R3) this;
            int i7 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r28.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i7 = 0;
                    }
                    r28.memoizedIsInitialized = (byte) i7;
                    return null;
                case 2:
                    return A0B(AnonymousClass8R3.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ည\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004င\u0003", new Object[]{"bitField0_", "index_", "value_", "padding_", "version_"});
                case 3:
                    return new AnonymousClass8R3();
                case 4:
                    return new AnonymousClass8LI();
                case 5:
                    return AnonymousClass8R3.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0360 = AnonymousClass8R3.PARSER;
                    if (r0360 != null) {
                        return r0360;
                    }
                    synchronized (AnonymousClass8R3.class) {
                        r053 = AnonymousClass8R3.PARSER;
                        if (r053 == null) {
                            C201979ko r0361 = C21072A7j.A01;
                            r053 = C90524aI.A0G(AnonymousClass8R3.DEFAULT_INSTANCE);
                            AnonymousClass8R3.PARSER = r053;
                        }
                    }
                    return r053;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PM) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d14 = A0d();
                    A0d14[1] = "emoji_";
                    A0d14[2] = "weight_";
                    return A0B(AnonymousClass8PM.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", A0d14);
                case 3:
                    return new AnonymousClass8PM();
                case 4:
                    return new AnonymousClass8LH();
                case 5:
                    return AnonymousClass8PM.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0362 = AnonymousClass8PM.PARSER;
                    if (r0362 != null) {
                        return r0362;
                    }
                    synchronized (AnonymousClass8PM.class) {
                        r052 = AnonymousClass8PM.PARSER;
                        if (r052 == null) {
                            C201979ko r0363 = C21072A7j.A01;
                            r052 = C90524aI.A0G(AnonymousClass8PM.DEFAULT_INSTANCE);
                            AnonymousClass8PM.PARSER = r052;
                        }
                    }
                    return r052;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173478Rv) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z14 = C90474aD.A1Z(13);
                    A1Z14[1] = "currentLthash_";
                    A1Z14[2] = "newLthash_";
                    A1Z14[3] = "patchVersion_";
                    A1Z14[4] = "collectionName_";
                    A1Z14[5] = "firstFourBytesFromAHashOfSnapshotMacKey_";
                    A1Z14[6] = "newLthashSubtract_";
                    A1Z14[7] = "numberAdd_";
                    A1Z14[8] = "numberRemove_";
                    A1Z14[9] = "numberOverride_";
                    A1Z14[10] = "senderPlatform_";
                    A1Z14[11] = A7J.A00;
                    A1Z14[12] = "isSenderPrimary_";
                    return A0B(C173478Rv.DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007င\u0006\bင\u0007\tင\b\nဌ\t\u000bဇ\n", A1Z14);
                case 3:
                    return new C173478Rv();
                case 4:
                    return new AnonymousClass8LG();
                case 5:
                    return C173478Rv.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0364 = C173478Rv.PARSER;
                    if (r0364 != null) {
                        return r0364;
                    }
                    synchronized (C173478Rv.class) {
                        r051 = C173478Rv.PARSER;
                        if (r051 == null) {
                            C201979ko r0365 = C21072A7j.A01;
                            r051 = C90524aI.A0G(C173478Rv.DEFAULT_INSTANCE);
                            C173478Rv.PARSER = r051;
                        }
                    }
                    return r051;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O3) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c33 = A0c();
                    A0c33[1] = "version_";
                    return A0B(AnonymousClass8O3.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", A0c33);
                case 3:
                    return new AnonymousClass8O3();
                case 4:
                    return new AnonymousClass8LF();
                case 5:
                    return AnonymousClass8O3.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0366 = AnonymousClass8O3.PARSER;
                    if (r0366 != null) {
                        return r0366;
                    }
                    synchronized (AnonymousClass8O3.class) {
                        r050 = AnonymousClass8O3.PARSER;
                        if (r050 == null) {
                            C201979ko r0367 = C21072A7j.A01;
                            r050 = C90524aI.A0G(AnonymousClass8O3.DEFAULT_INSTANCE);
                            AnonymousClass8O3.PARSER = r050;
                        }
                    }
                    return r050;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O2) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c34 = A0c();
                    A0c34[1] = "blob_";
                    return A0B(AnonymousClass8O2.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", A0c34);
                case 3:
                    return new AnonymousClass8O2();
                case 4:
                    return new AnonymousClass8LE();
                case 5:
                    return AnonymousClass8O2.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0368 = AnonymousClass8O2.PARSER;
                    if (r0368 != null) {
                        return r0368;
                    }
                    synchronized (AnonymousClass8O2.class) {
                        r049 = AnonymousClass8O2.PARSER;
                        if (r049 == null) {
                            C201979ko r0369 = C21072A7j.A01;
                            r049 = C90524aI.A0G(AnonymousClass8O2.DEFAULT_INSTANCE);
                            AnonymousClass8O2.PARSER = r049;
                        }
                    }
                    return r049;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173138Qn) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g9 = A0g();
                    A0g9[1] = "version_";
                    A0g9[2] = "records_";
                    A0g9[3] = AnonymousClass8QF.class;
                    A0g9[4] = "mac_";
                    A0g9[5] = "keyId_";
                    return A0B(C173138Qn.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဉ\u0002", A0g9);
                case 3:
                    return new C173138Qn();
                case 4:
                    return new AnonymousClass8LD();
                case 5:
                    return C173138Qn.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0370 = C173138Qn.PARSER;
                    if (r0370 != null) {
                        return r0370;
                    }
                    synchronized (C173138Qn.class) {
                        r048 = C173138Qn.PARSER;
                        if (r048 == null) {
                            C201979ko r0371 = C21072A7j.A01;
                            r048 = C90524aI.A0G(C173138Qn.DEFAULT_INSTANCE);
                            C173138Qn.PARSER = r048;
                        }
                    }
                    return r048;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QF) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e17 = A0e();
                    A0e17[1] = "index_";
                    A0e17[2] = "value_";
                    A0e17[3] = "keyId_";
                    return A0B(AnonymousClass8QF.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", A0e17);
                case 3:
                    return new AnonymousClass8QF();
                case 4:
                    return new AnonymousClass8LC();
                case 5:
                    return AnonymousClass8QF.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0372 = AnonymousClass8QF.PARSER;
                    if (r0372 != null) {
                        return r0372;
                    }
                    synchronized (AnonymousClass8QF.class) {
                        r047 = AnonymousClass8QF.PARSER;
                        if (r047 == null) {
                            C201979ko r0373 = C21072A7j.A01;
                            r047 = C90524aI.A0G(AnonymousClass8QF.DEFAULT_INSTANCE);
                            AnonymousClass8QF.PARSER = r047;
                        }
                    }
                    return r047;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173408Ro) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z15 = C90474aD.A1Z(11);
                    A1Z15[1] = "version_";
                    A1Z15[2] = "mutations_";
                    A1Z15[3] = AnonymousClass8PL.class;
                    A1Z15[4] = "externalMutations_";
                    A1Z15[5] = "snapshotMac_";
                    A1Z15[6] = "patchMac_";
                    A1Z15[7] = "keyId_";
                    A1Z15[8] = "exitCode_";
                    A1Z15[9] = "deviceIndex_";
                    A1Z15[10] = "clientDebugData_";
                    return A0B(C173408Ro.DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ည\u0002\u0005ည\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဋ\u0006\tည\u0007", A1Z15);
                case 3:
                    return new C173408Ro();
                case 4:
                    return new AnonymousClass8LB();
                case 5:
                    return C173408Ro.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0374 = C173408Ro.PARSER;
                    if (r0374 != null) {
                        return r0374;
                    }
                    synchronized (C173408Ro.class) {
                        r046 = C173408Ro.PARSER;
                        if (r046 == null) {
                            C201979ko r0375 = C21072A7j.A01;
                            r046 = C90524aI.A0G(C173408Ro.DEFAULT_INSTANCE);
                            C173408Ro.PARSER = r046;
                        }
                    }
                    return r046;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8NY) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0M5 = AnonymousClass001.A0M();
                    A0M5[0] = "mutations_";
                    A0M5[1] = AnonymousClass8PL.class;
                    return A0B(AnonymousClass8NY.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A0M5);
                case 3:
                    return new AnonymousClass8NY();
                case 4:
                    return new AnonymousClass8LA();
                case 5:
                    return AnonymousClass8NY.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0376 = AnonymousClass8NY.PARSER;
                    if (r0376 != null) {
                        return r0376;
                    }
                    synchronized (AnonymousClass8NY.class) {
                        r045 = AnonymousClass8NY.PARSER;
                        if (r045 == null) {
                            C201979ko r0377 = C21072A7j.A01;
                            r045 = C90524aI.A0G(AnonymousClass8NY.DEFAULT_INSTANCE);
                            AnonymousClass8NY.PARSER = r045;
                        }
                    }
                    return r045;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PL) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e18 = A0e();
                    A0e18[1] = "operation_";
                    A0e18[2] = A7I.A00;
                    A0e18[3] = "record_";
                    return A0B(AnonymousClass8PL.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", A0e18);
                case 3:
                    return new AnonymousClass8PL();
                case 4:
                    return new AnonymousClass8L9();
                case 5:
                    return AnonymousClass8PL.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0378 = AnonymousClass8PL.PARSER;
                    if (r0378 != null) {
                        return r0378;
                    }
                    synchronized (AnonymousClass8PL.class) {
                        r044 = AnonymousClass8PL.PARSER;
                        if (r044 == null) {
                            C201979ko r0379 = C21072A7j.A01;
                            r044 = C90524aI.A0G(AnonymousClass8PL.DEFAULT_INSTANCE);
                            AnonymousClass8PL.PARSER = r044;
                        }
                    }
                    return r044;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O1) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c35 = A0c();
                    A0c35[1] = "blob_";
                    return A0B(AnonymousClass8O1.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", A0c35);
                case 3:
                    return new AnonymousClass8O1();
                case 4:
                    return new AnonymousClass8L8();
                case 5:
                    return AnonymousClass8O1.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0380 = AnonymousClass8O1.PARSER;
                    if (r0380 != null) {
                        return r0380;
                    }
                    synchronized (AnonymousClass8O1.class) {
                        r043 = AnonymousClass8O1.PARSER;
                        if (r043 == null) {
                            C201979ko r0381 = C21072A7j.A01;
                            r043 = C90524aI.A0G(AnonymousClass8O1.DEFAULT_INSTANCE);
                            AnonymousClass8O1.PARSER = r043;
                        }
                    }
                    return r043;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8O0) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c36 = A0c();
                    A0c36[1] = "id_";
                    return A0B(AnonymousClass8O0.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", A0c36);
                case 3:
                    return new AnonymousClass8O0();
                case 4:
                    return new AnonymousClass8L7();
                case 5:
                    return AnonymousClass8O0.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0382 = AnonymousClass8O0.PARSER;
                    if (r0382 != null) {
                        return r0382;
                    }
                    synchronized (AnonymousClass8O0.class) {
                        r042 = AnonymousClass8O0.PARSER;
                        if (r042 == null) {
                            C201979ko r0383 = C21072A7j.A01;
                            r042 = C90524aI.A0G(AnonymousClass8O0.DEFAULT_INSTANCE);
                            AnonymousClass8O0.PARSER = r042;
                        }
                    }
                    return r042;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PK) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d15 = A0d();
                    A0d15[1] = "code_";
                    A0d15[2] = "text_";
                    return A0B(AnonymousClass8PK.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001", A0d15);
                case 3:
                    return new AnonymousClass8PK();
                case 4:
                    return new AnonymousClass8L6();
                case 5:
                    return AnonymousClass8PK.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0384 = AnonymousClass8PK.PARSER;
                    if (r0384 != null) {
                        return r0384;
                    }
                    synchronized (AnonymousClass8PK.class) {
                        r041 = AnonymousClass8PK.PARSER;
                        if (r041 == null) {
                            C201979ko r0385 = C21072A7j.A01;
                            r041 = C90524aI.A0G(AnonymousClass8PK.DEFAULT_INSTANCE);
                            AnonymousClass8PK.PARSER = r041;
                        }
                    }
                    return r041;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173008Qa) {
            C173008Qa r29 = (C173008Qa) this;
            Class<C173008Qa> cls = C173008Qa.class;
            int i8 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r29.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i8 = 0;
                    }
                    r29.memoizedIsInitialized = (byte) i8;
                    return null;
                case 2:
                    return A0B(C173008Qa.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0003\u0001ᔌ\u0000\u0002Л\u0003Л", new Object[]{"bitField0_", "clauseType_", A7F.A00, "clauses_", cls, "filters_", AnonymousClass8R2.class});
                case 3:
                    return new C173008Qa();
                case 4:
                    return new AnonymousClass8L5();
                case 5:
                    return C173008Qa.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0386 = C173008Qa.PARSER;
                    if (r0386 != null) {
                        return r0386;
                    }
                    synchronized (cls) {
                        r040 = C173008Qa.PARSER;
                        if (r040 == null) {
                            C201979ko r0387 = C21072A7j.A01;
                            r040 = C90524aI.A0G(C173008Qa.DEFAULT_INSTANCE);
                            C173008Qa.PARSER = r040;
                        }
                    }
                    return r040;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8R2) {
            AnonymousClass8R2 r210 = (AnonymousClass8R2) this;
            int i9 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r210.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i9 = 0;
                    }
                    r210.memoizedIsInitialized = (byte) i9;
                    return null;
                case 2:
                    return A0B(AnonymousClass8R2.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0002\u0001ᔈ\u0000\u00022\u0003ဌ\u0001\u0004ᔌ\u0002", new Object[]{"bitField0_", "filterName_", "parameters_", C1906199q.A00, "filterResult_", A7H.A00, "clientNotSupportedConfig_", A7G.A00});
                case 3:
                    return new AnonymousClass8R2();
                case 4:
                    return new AnonymousClass8L4();
                case 5:
                    return AnonymousClass8R2.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0388 = AnonymousClass8R2.PARSER;
                    if (r0388 != null) {
                        return r0388;
                    }
                    synchronized (AnonymousClass8R2.class) {
                        r039 = AnonymousClass8R2.PARSER;
                        if (r039 == null) {
                            C201979ko r0389 = C21072A7j.A01;
                            r039 = C90524aI.A0G(AnonymousClass8R2.DEFAULT_INSTANCE);
                            AnonymousClass8R2.PARSER = r039;
                        }
                    }
                    return r039;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8SW) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f9 = A0f();
                    A0f9[1] = "remoteJid_";
                    A0f9[2] = "fromMe_";
                    A0f9[3] = "id_";
                    A0f9[4] = "participant_";
                    return A0B(AnonymousClass8SW.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", A0f9);
                case 3:
                    return new AnonymousClass8SW();
                case 4:
                    return new AnonymousClass8NG();
                case 5:
                    return AnonymousClass8SW.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0390 = AnonymousClass8SW.PARSER;
                    if (r0390 != null) {
                        return r0390;
                    }
                    synchronized (AnonymousClass8SW.class) {
                        r038 = AnonymousClass8SW.PARSER;
                        if (r038 == null) {
                            C201979ko r0391 = C21072A7j.A01;
                            r038 = C90524aI.A0G(AnonymousClass8SW.DEFAULT_INSTANCE);
                            AnonymousClass8SW.PARSER = r038;
                        }
                    }
                    return r038;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RW) {
            AnonymousClass8RW r211 = (AnonymousClass8RW) this;
            int i10 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r211.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i10 = 0;
                    }
                    r211.memoizedIsInitialized = (byte) i10;
                    return null;
                case 2:
                    return A0B(AnonymousClass8RW.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"bitField0_", "startTimestamp_", "receiverHandle_", "senderHandle_", "invoiceUrl_", "mandateDetails_", "mandateUpdates_"});
                case 3:
                    return new AnonymousClass8RW();
                case 4:
                    return new AnonymousClass8L1();
                case 5:
                    return AnonymousClass8RW.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0392 = AnonymousClass8RW.PARSER;
                    if (r0392 != null) {
                        return r0392;
                    }
                    synchronized (AnonymousClass8RW.class) {
                        r037 = AnonymousClass8RW.PARSER;
                        if (r037 == null) {
                            C201979ko r0393 = C21072A7j.A01;
                            r037 = C90524aI.A0G(AnonymousClass8RW.DEFAULT_INSTANCE);
                            AnonymousClass8RW.PARSER = r037;
                        }
                    }
                    return r037;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173368Rk) {
            C173368Rk r212 = (C173368Rk) this;
            int i11 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r212.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i11 = 0;
                    }
                    r212.memoizedIsInitialized = (byte) i11;
                    return null;
                case 2:
                    return A0B(C173368Rk.DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ᔄ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bᔄ\u0007", new Object[]{"bitField0_", "action_", "amount_", "acceptEndTimestamp_", "amountRule_", "errorCode_", "seqNo_", "mandateUpdateInfo_", "status_"});
                case 3:
                    return new C173368Rk();
                case 4:
                    return new AnonymousClass8L3();
                case 5:
                    return C173368Rk.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0394 = C173368Rk.PARSER;
                    if (r0394 != null) {
                        return r0394;
                    }
                    synchronized (C173368Rk.class) {
                        r036 = C173368Rk.PARSER;
                        if (r036 == null) {
                            C201979ko r0395 = C21072A7j.A01;
                            r036 = C90524aI.A0G(C173368Rk.DEFAULT_INSTANCE);
                            C173368Rk.PARSER = r036;
                        }
                    }
                    return r036;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173438Rr) {
            C173438Rr r213 = (C173438Rr) this;
            int i12 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r213.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i12 = 0;
                    }
                    r213.memoizedIsInitialized = (byte) i12;
                    return null;
                case 2:
                    return A0B(C173438Rr.DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0005\u0001ᔂ\u0000\u0002ᔂ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ᔇ\u0005\u0007ဈ\u0006\bဈ\u0007\tᔉ\b", new Object[]{"bitField0_", "acceptEndTimestamp_", "acceptStartTimestamp_", "amountRule_", "errorCode_", "frequencyRule_", "isRevocable_", "mandateInfo_", "mandateNo_", "originalAmount_"});
                case 3:
                    return new C173438Rr();
                case 4:
                    return new AnonymousClass8L2();
                case 5:
                    return C173438Rr.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0396 = C173438Rr.PARSER;
                    if (r0396 != null) {
                        return r0396;
                    }
                    synchronized (C173438Rr.class) {
                        r035 = C173438Rr.PARSER;
                        if (r035 == null) {
                            C201979ko r0397 = C21072A7j.A01;
                            r035 = C90524aI.A0G(C173438Rr.DEFAULT_INSTANCE);
                            C173438Rr.PARSER = r035;
                        }
                    }
                    return r035;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8S9) {
            AnonymousClass8S9 r214 = (AnonymousClass8S9) this;
            int i13 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r214.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i13 = 0;
                    }
                    r214.memoizedIsInitialized = (byte) i13;
                    return null;
                case 2:
                    return A0B(AnonymousClass8S9.DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0000\u0005\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bᔂ\u0007\tᔂ\b\u000bဈ\t\rဈ\n\u000eᔄ\u000b\u000fᔉ\f\u0011ဉ\r\u0012ᐉ\u000e\u0013ဌ\u000f\u0014ဇ\u0010\u0015ဈ\u0011", new Object[]{"bitField0_", "amount_", "collectRequestId_", "counter_", "expiryTimestamp_", "lastStatusTimestamp_", "localTransactionId_", "messageKey_", "previousStatus_", "previousType_", "referenceMessageID_", "service_", "version_", "marketMetadata_", "order_", "offerClaim_", "messageType_", A7E.A00, "messageContainsBackground_", "senderAlias_"});
                case 3:
                    return new AnonymousClass8S9();
                case 4:
                    return new C171678Kx();
                case 5:
                    return AnonymousClass8S9.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0398 = AnonymousClass8S9.PARSER;
                    if (r0398 != null) {
                        return r0398;
                    }
                    synchronized (AnonymousClass8S9.class) {
                        r034 = AnonymousClass8S9.PARSER;
                        if (r034 == null) {
                            C201979ko r0399 = C21072A7j.A01;
                            r034 = C90524aI.A0G(AnonymousClass8S9.DEFAULT_INSTANCE);
                            AnonymousClass8S9.PARSER = r034;
                        }
                    }
                    return r034;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172858Pl) {
            C172858Pl r3 = (C172858Pl) this;
            int i14 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r3.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i14 = 0;
                    }
                    r3.memoizedIsInitialized = (byte) i14;
                    return null;
                case 2:
                    Object[] objArr = new Object[5];
                    objArr[0] = "metadataValue_";
                    A0Z(objArr, "metadataValueCase_");
                    objArr[3] = AnonymousClass8RW.class;
                    objArr[4] = C172478Nz.class;
                    return A0B(C172858Pl.DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ြ\u0000", objArr);
                case 3:
                    return new C172858Pl();
                case 4:
                    return new AnonymousClass8L0();
                case 5:
                    return C172858Pl.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0400 = C172858Pl.PARSER;
                    if (r0400 != null) {
                        return r0400;
                    }
                    synchronized (C172858Pl.class) {
                        r033 = C172858Pl.PARSER;
                        if (r033 == null) {
                            C201979ko r0401 = C21072A7j.A01;
                            r033 = C90524aI.A0G(C172858Pl.DEFAULT_INSTANCE);
                            C172858Pl.PARSER = r033;
                        }
                    }
                    return r033;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PJ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d16 = A0d();
                    A0d16[1] = "id_";
                    A0d16[2] = "messageKey_";
                    return A0B(AnonymousClass8PJ.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", A0d16);
                case 3:
                    return new AnonymousClass8PJ();
                case 4:
                    return new C171698Kz();
                case 5:
                    return AnonymousClass8PJ.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0402 = AnonymousClass8PJ.PARSER;
                    if (r0402 != null) {
                        return r0402;
                    }
                    synchronized (AnonymousClass8PJ.class) {
                        r032 = AnonymousClass8PJ.PARSER;
                        if (r032 == null) {
                            C201979ko r0403 = C21072A7j.A01;
                            r032 = C90524aI.A0G(AnonymousClass8PJ.DEFAULT_INSTANCE);
                            AnonymousClass8PJ.PARSER = r032;
                        }
                    }
                    return r032;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8R1) {
            AnonymousClass8R1 r215 = (AnonymousClass8R1) this;
            int i15 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r215.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i15 = 0;
                    }
                    r215.memoizedIsInitialized = (byte) i15;
                    return null;
                case 2:
                    return A0B(AnonymousClass8R1.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "offerId_", "id_", "incentiveTransactionId_", "parentTransactionId_"});
                case 3:
                    return new AnonymousClass8R1();
                case 4:
                    return new C171688Ky();
                case 5:
                    return AnonymousClass8R1.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0404 = AnonymousClass8R1.PARSER;
                    if (r0404 != null) {
                        return r0404;
                    }
                    synchronized (AnonymousClass8R1.class) {
                        r031 = AnonymousClass8R1.PARSER;
                        if (r031 == null) {
                            C201979ko r0405 = C21072A7j.A01;
                            r031 = C90524aI.A0G(AnonymousClass8R1.DEFAULT_INSTANCE);
                            AnonymousClass8R1.PARSER = r031;
                        }
                    }
                    return r031;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172478Nz) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c37 = A0c();
                    A0c37[1] = "paymentRails_";
                    return A0B(C172478Nz.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A0c37);
                case 3:
                    return new C172478Nz();
                case 4:
                    return new C171668Kw();
                case 5:
                    return C172478Nz.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0406 = C172478Nz.PARSER;
                    if (r0406 != null) {
                        return r0406;
                    }
                    synchronized (C172478Nz.class) {
                        r030 = C172478Nz.PARSER;
                        if (r030 == null) {
                            C201979ko r0407 = C21072A7j.A01;
                            r030 = C90524aI.A0G(C172478Nz.DEFAULT_INSTANCE);
                            C172478Nz.PARSER = r030;
                        }
                    }
                    return r030;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QE) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e19 = A0e();
                    A0e19[1] = "botMessageInfo_";
                    A0e19[2] = "editVersion_";
                    A0e19[3] = "callLogMessageInfo_";
                    return A0B(AnonymousClass8QE.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", A0e19);
                case 3:
                    return new AnonymousClass8QE();
                case 4:
                    return new C171658Kv();
                case 5:
                    return AnonymousClass8QE.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0408 = AnonymousClass8QE.PARSER;
                    if (r0408 != null) {
                        return r0408;
                    }
                    synchronized (AnonymousClass8QE.class) {
                        r029 = AnonymousClass8QE.PARSER;
                        if (r029 == null) {
                            C201979ko r0409 = C21072A7j.A01;
                            r029 = C90524aI.A0G(AnonymousClass8QE.DEFAULT_INSTANCE);
                            AnonymousClass8QE.PARSER = r029;
                        }
                    }
                    return r029;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172468Ny) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c38 = A0c();
                    A0c38[1] = "callLogRowId_";
                    return A0B(C172468Ny.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", A0c38);
                case 3:
                    return new C172468Ny();
                case 4:
                    return new C171648Ku();
                case 5:
                    return C172468Ny.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0410 = C172468Ny.PARSER;
                    if (r0410 != null) {
                        return r0410;
                    }
                    synchronized (C172468Ny.class) {
                        r028 = C172468Ny.PARSER;
                        if (r028 == null) {
                            C201979ko r0411 = C21072A7j.A01;
                            r028 = C90524aI.A0G(C172468Ny.DEFAULT_INSTANCE);
                            C172468Ny.PARSER = r028;
                        }
                    }
                    return r028;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172458Nx) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0c39 = A0c();
                    A0c39[1] = "editTargetId_";
                    return A0B(C172458Nx.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A0c39);
                case 3:
                    return new C172458Nx();
                case 4:
                    return new C171638Kt();
                case 5:
                    return C172458Nx.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0412 = C172458Nx.PARSER;
                    if (r0412 != null) {
                        return r0412;
                    }
                    synchronized (C172458Nx.class) {
                        r027 = C172458Nx.PARSER;
                        if (r027 == null) {
                            C201979ko r0413 = C21072A7j.A01;
                            r027 = C90524aI.A0G(C172458Nx.DEFAULT_INSTANCE);
                            C172458Nx.PARSER = r027;
                        }
                    }
                    return r027;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173468Ru) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z16 = C90474aD.A1Z(12);
                    A0Y(A1Z16);
                    A1Z16[10] = "weight_";
                    A1Z16[11] = "lastStickerSentTs_";
                    return A0B(C173468Ru.DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဈ\u0007\tဃ\b\nခ\t\u000bဂ\n", A1Z16);
                case 3:
                    return new C173468Ru();
                case 4:
                    return new C171628Ks();
                case 5:
                    return C173468Ru.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0414 = C173468Ru.PARSER;
                    if (r0414 != null) {
                        return r0414;
                    }
                    synchronized (C173468Ru.class) {
                        r026 = C173468Ru.PARSER;
                        if (r026 == null) {
                            C201979ko r0415 = C21072A7j.A01;
                            r026 = C90524aI.A0G(C173468Ru.DEFAULT_INSTANCE);
                            C173468Ru.PARSER = r026;
                        }
                    }
                    return r026;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PI) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e20 = A0e();
                    A0e20[1] = "groupJid_";
                    A0e20[2] = "pastParticipants_";
                    A0e20[3] = AnonymousClass8QD.class;
                    return A0B(AnonymousClass8PI.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", A0e20);
                case 3:
                    return new AnonymousClass8PI();
                case 4:
                    return new C171618Kr();
                case 5:
                    return AnonymousClass8PI.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0416 = AnonymousClass8PI.PARSER;
                    if (r0416 != null) {
                        return r0416;
                    }
                    synchronized (AnonymousClass8PI.class) {
                        r025 = AnonymousClass8PI.PARSER;
                        if (r025 == null) {
                            C201979ko r0417 = C21072A7j.A01;
                            r025 = C90524aI.A0G(AnonymousClass8PI.DEFAULT_INSTANCE);
                            AnonymousClass8PI.PARSER = r025;
                        }
                    }
                    return r025;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QD) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f10 = A0f();
                    A0f10[1] = "userJid_";
                    A0f10[2] = "leaveReason_";
                    A0f10[3] = A7C.A00;
                    A0f10[4] = "leaveTs_";
                    return A0B(AnonymousClass8QD.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဃ\u0002", A0f10);
                case 3:
                    return new AnonymousClass8QD();
                case 4:
                    return new C171608Kq();
                case 5:
                    return AnonymousClass8QD.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0418 = AnonymousClass8QD.PARSER;
                    if (r0418 != null) {
                        return r0418;
                    }
                    synchronized (AnonymousClass8QD.class) {
                        r024 = AnonymousClass8QD.PARSER;
                        if (r024 == null) {
                            C201979ko r0419 = C21072A7j.A01;
                            r024 = C90524aI.A0G(AnonymousClass8QD.DEFAULT_INSTANCE);
                            AnonymousClass8QD.PARSER = r024;
                        }
                    }
                    return r024;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172848Pk) {
            C172848Pk r216 = (C172848Pk) this;
            int i16 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r216.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i16 = 0;
                    }
                    r216.memoizedIsInitialized = (byte) i16;
                    return null;
                case 2:
                    Object[] A1Q4 = C36441kJ.A1Q();
                    A1Q4[0] = "bitField0_";
                    A1Q4[1] = "message_";
                    A1Q4[2] = "msgOrderId_";
                    return A0B(C172848Pk.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဃ\u0001", A1Q4);
                case 3:
                    return new C172848Pk();
                case 4:
                    return new C171598Kp();
                case 5:
                    return C172848Pk.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0420 = C172848Pk.PARSER;
                    if (r0420 != null) {
                        return r0420;
                    }
                    synchronized (C172848Pk.class) {
                        r023 = C172848Pk.PARSER;
                        if (r023 == null) {
                            C201979ko r0421 = C21072A7j.A01;
                            r023 = C90524aI.A0G(C172848Pk.DEFAULT_INSTANCE);
                            C172848Pk.PARSER = r023;
                        }
                    }
                    return r023;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8NP) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0B(AnonymousClass8NP.DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
                case 3:
                    return new AnonymousClass8NP();
                case 4:
                    return new C171588Ko();
                case 5:
                    return AnonymousClass8NP.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r217 = AnonymousClass8NP.PARSER;
                    if (r217 != null) {
                        return r217;
                    }
                    synchronized (AnonymousClass8NP.class) {
                        r2 = AnonymousClass8NP.PARSER;
                        if (r2 == null) {
                            C201979ko r0422 = C21072A7j.A01;
                            r2 = C90524aI.A0G(AnonymousClass8NP.DEFAULT_INSTANCE);
                            AnonymousClass8NP.PARSER = r2;
                        }
                    }
                    return r2;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C172838Pj) {
            C172838Pj r218 = (C172838Pj) this;
            int i17 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r218.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i17 = 0;
                    }
                    r218.memoizedIsInitialized = (byte) i17;
                    return null;
                case 2:
                    Object[] A1Q5 = C36441kJ.A1Q();
                    A1Q5[0] = "bitField0_";
                    A1Q5[1] = "botInfo_";
                    A1Q5[2] = "stanzaInfo_";
                    return A0B(C172838Pj.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", A1Q5);
                case 3:
                    return new C172838Pj();
                case 4:
                    return new C171578Kn();
                case 5:
                    return C172838Pj.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0423 = C172838Pj.PARSER;
                    if (r0423 != null) {
                        return r0423;
                    }
                    synchronized (C172838Pj.class) {
                        r022 = C172838Pj.PARSER;
                        if (r022 == null) {
                            C201979ko r0424 = C21072A7j.A01;
                            r022 = C90524aI.A0G(C172838Pj.DEFAULT_INSTANCE);
                            C172838Pj.PARSER = r022;
                        }
                    }
                    return r022;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8R0) {
            AnonymousClass8R0 r219 = (AnonymousClass8R0) this;
            int i18 = 1;
            switch (num.intValue()) {
                case 0:
                    return Byte.valueOf(r219.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i18 = 0;
                    }
                    r219.memoizedIsInitialized = (byte) i18;
                    return null;
                case 2:
                    return A0B(AnonymousClass8R0.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "targetId_", "editTargetId_", "targetChatJid_", "targetSenderJid_"});
                case 3:
                    return new AnonymousClass8R0();
                case 4:
                    return new C171568Km();
                case 5:
                    return AnonymousClass8R0.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0425 = AnonymousClass8R0.PARSER;
                    if (r0425 != null) {
                        return r0425;
                    }
                    synchronized (AnonymousClass8R0.class) {
                        r021 = AnonymousClass8R0.PARSER;
                        if (r021 == null) {
                            C201979ko r0426 = C21072A7j.A01;
                            r021 = C90524aI.A0G(AnonymousClass8R0.DEFAULT_INSTANCE);
                            AnonymousClass8R0.PARSER = r021;
                        }
                    }
                    return r021;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RS) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z17 = C90474aD.A1Z(7);
                    A1Z17[1] = "conversation_";
                    A1Z17[2] = "imageMessage_";
                    A1Z17[3] = "documentMessage_";
                    A1Z17[4] = "audioMessage_";
                    A1Z17[5] = "videoMessage_";
                    A1Z17[6] = "ptvMessage_";
                    return A0B(AnonymousClass8RS.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001B\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004Bဉ\u0005", A1Z17);
                case 3:
                    return new AnonymousClass8RS();
                case 4:
                    return new C171528Ki();
                case 5:
                    return AnonymousClass8RS.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0427 = AnonymousClass8RS.PARSER;
                    if (r0427 != null) {
                        return r0427;
                    }
                    synchronized (AnonymousClass8RS.class) {
                        r020 = AnonymousClass8RS.PARSER;
                        if (r020 == null) {
                            C201979ko r0428 = C21072A7j.A01;
                            r020 = C90524aI.A0G(AnonymousClass8RS.DEFAULT_INSTANCE);
                            AnonymousClass8RS.PARSER = r020;
                        }
                    }
                    return r020;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8S8) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z18 = C90474aD.A1Z(20);
                    A1Z18[1] = "mimetype_";
                    A1Z18[2] = "fileSha256_";
                    A1Z18[3] = "fileLength_";
                    A1Z18[4] = "seconds_";
                    A1Z18[5] = "mediaKey_";
                    A1Z18[6] = "caption_";
                    A1Z18[7] = "gifPlayback_";
                    A1Z18[8] = "height_";
                    A1Z18[9] = "width_";
                    A1Z18[10] = "fileEncSha256_";
                    A1Z18[11] = "directPath_";
                    A1Z18[12] = "mediaKeyTimestamp_";
                    A1Z18[13] = "jpegThumbnail_";
                    A1Z18[14] = "streamingSidecar_";
                    A1Z18[15] = "gifAttribution_";
                    A1Z18[16] = A7B.A00;
                    A1Z18[17] = "thumbnailDirectPath_";
                    A1Z18[18] = "thumbnailSha256_";
                    A1Z18[19] = "thumbnailEncSha256_";
                    return A0B(AnonymousClass8S8.DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0002\u0017\u0012\u0000\u0000\u0000\u0002ဈ\u0000\u0003ည\u0001\u0004ဃ\u0002\u0005ဋ\u0003\u0006ည\u0004\u0007ဈ\u0005\bဇ\u0006\tဋ\u0007\nဋ\b\u000bည\t\rဈ\n\u000eဂ\u000b\u0010ည\f\u0012ည\r\u0013ဌ\u000e\u0015ဈ\u000f\u0016ည\u0010\u0017ည\u0011", A1Z18);
                case 3:
                    return new AnonymousClass8S8();
                case 4:
                    return new C171558Kl();
                case 5:
                    return AnonymousClass8S8.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0429 = AnonymousClass8S8.PARSER;
                    if (r0429 != null) {
                        return r0429;
                    }
                    synchronized (AnonymousClass8S8.class) {
                        r019 = AnonymousClass8S8.PARSER;
                        if (r019 == null) {
                            C201979ko r0430 = C21072A7j.A01;
                            r019 = C90524aI.A0G(AnonymousClass8S8.DEFAULT_INSTANCE);
                            AnonymousClass8S8.PARSER = r019;
                        }
                    }
                    return r019;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8SB) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z19 = C90474aD.A1Z(20);
                    A1Z19[1] = "mimetype_";
                    AnonymousClass8S5.A0i(A1Z19, "caption_");
                    A1Z19[5] = "height_";
                    A1Z19[6] = "width_";
                    AnonymousClass8S5.A0j(A1Z19, "mediaKey_");
                    A1Z19[11] = "jpegThumbnail_";
                    A1Z19[12] = "experimentGroupId_";
                    A1Z19[13] = "scansSidecar_";
                    A1Z19[14] = "scanLengths_";
                    A1Z19[15] = "midQualityFileSha256_";
                    A1Z19[16] = "midQualityFileEncSha256_";
                    A1Z19[17] = "thumbnailDirectPath_";
                    A1Z19[18] = "thumbnailSha256_";
                    A1Z19[19] = "thumbnailEncSha256_";
                    return A0B(AnonymousClass8SB.DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0002\u001c\u0013\u0000\u0001\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ည\u0002\u0005ဃ\u0003\u0006ဋ\u0004\u0007ဋ\u0005\bည\u0006\tည\u0007\u000bဈ\b\fဂ\t\u0010ည\n\u0014ဋ\u000b\u0015ည\f\u0016\u001d\u0017ည\r\u0018ည\u000e\u001aဈ\u000f\u001bည\u0010\u001cည\u0011", A1Z19);
                case 3:
                    return new AnonymousClass8SB();
                case 4:
                    return new C171548Kk();
                case 5:
                    return AnonymousClass8SB.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0431 = AnonymousClass8SB.PARSER;
                    if (r0431 != null) {
                        return r0431;
                    }
                    synchronized (AnonymousClass8SB.class) {
                        r018 = AnonymousClass8SB.PARSER;
                        if (r018 == null) {
                            C201979ko r0432 = C21072A7j.A01;
                            r018 = C90524aI.A0G(AnonymousClass8SB.DEFAULT_INSTANCE);
                            AnonymousClass8SB.PARSER = r018;
                        }
                    }
                    return r018;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8S7) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z20 = C90474aD.A1Z(19);
                    A1Z20[1] = "mimetype_";
                    AnonymousClass8S5.A0i(A1Z20, "title_");
                    A1Z20[5] = "pageCount_";
                    A1Z20[6] = "mediaKey_";
                    AnonymousClass8S5.A0j(A1Z20, "fileName_");
                    A1Z20[11] = "contactVcard_";
                    A1Z20[12] = "thumbnailDirectPath_";
                    A1Z20[13] = "thumbnailSha256_";
                    A1Z20[14] = "thumbnailEncSha256_";
                    A1Z20[15] = "jpegThumbnail_";
                    A1Z20[16] = "thumbnailHeight_";
                    A1Z20[17] = "thumbnailWidth_";
                    A1Z20[18] = "caption_";
                    return A0B(AnonymousClass8S7.DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0002\u0014\u0012\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ည\u0002\u0005ဃ\u0003\u0006ဋ\u0004\u0007ည\u0005\bဈ\u0006\tည\u0007\nဈ\b\u000bဂ\t\fဇ\n\rဈ\u000b\u000eည\f\u000fည\r\u0010ည\u000e\u0012ဋ\u000f\u0013ဋ\u0010\u0014ဈ\u0011", A1Z20);
                case 3:
                    return new AnonymousClass8S7();
                case 4:
                    return new C171538Kj();
                case 5:
                    return AnonymousClass8S7.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0433 = AnonymousClass8S7.PARSER;
                    if (r0433 != null) {
                        return r0433;
                    }
                    synchronized (AnonymousClass8S7.class) {
                        r017 = AnonymousClass8S7.PARSER;
                        if (r017 == null) {
                            C201979ko r0434 = C21072A7j.A01;
                            r017 = C90524aI.A0G(AnonymousClass8S7.DEFAULT_INSTANCE);
                            AnonymousClass8S7.PARSER = r017;
                        }
                    }
                    return r017;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173518Rz) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z21 = C90474aD.A1Z(13);
                    A1Z21[1] = "mimetype_";
                    A1Z21[2] = "fileSha256_";
                    A1Z21[3] = "fileLength_";
                    A1Z21[4] = "seconds_";
                    A1Z21[5] = "ptt_";
                    A1Z21[6] = "mediaKey_";
                    A1Z21[7] = "fileEncSha256_";
                    A1Z21[8] = "directPath_";
                    A1Z21[9] = "mediaKeyTimestamp_";
                    A1Z21[10] = "streamingSidecar_";
                    A1Z21[11] = "waveform_";
                    A1Z21[12] = "backgroundArgb_";
                    return A0B(C173518Rz.DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0002\u0014\f\u0000\u0000\u0000\u0002ဈ\u0000\u0003ည\u0001\u0004ဃ\u0002\u0005ဋ\u0003\u0006ဇ\u0004\u0007ည\u0005\bည\u0006\tဈ\u0007\nဂ\b\u0012ည\t\u0013ည\n\u0014ဆ\u000b", A1Z21);
                case 3:
                    return new C173518Rz();
                case 4:
                    return new C171518Kh();
                case 5:
                    return C173518Rz.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0435 = C173518Rz.PARSER;
                    if (r0435 != null) {
                        return r0435;
                    }
                    synchronized (C173518Rz.class) {
                        r016 = C173518Rz.PARSER;
                        if (r016 == null) {
                            C201979ko r0436 = C21072A7j.A01;
                            r016 = C90524aI.A0G(C173518Rz.DEFAULT_INSTANCE);
                            C173518Rz.PARSER = r016;
                        }
                    }
                    return r016;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QX) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = "button_";
                    A0Z(objArr2, "buttonCase_");
                    objArr2[3] = AnonymousClass8PG.class;
                    objArr2[4] = AnonymousClass8PH.class;
                    objArr2[5] = AnonymousClass8PF.class;
                    objArr2[6] = "index_";
                    return A0B(AnonymousClass8QX.DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဋ\u0003", objArr2);
                case 3:
                    return new AnonymousClass8QX();
                case 4:
                    return new C171478Kd();
                case 5:
                    return AnonymousClass8QX.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0437 = AnonymousClass8QX.PARSER;
                    if (r0437 != null) {
                        return r0437;
                    }
                    synchronized (AnonymousClass8QX.class) {
                        r015 = AnonymousClass8QX.PARSER;
                        if (r015 == null) {
                            C201979ko r0438 = C21072A7j.A01;
                            r015 = C90524aI.A0G(AnonymousClass8QX.DEFAULT_INSTANCE);
                            AnonymousClass8QX.PARSER = r015;
                        }
                    }
                    return r015;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PH) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d17 = A0d();
                    A0d17[1] = "displayText_";
                    A0d17[2] = "url_";
                    return A0B(AnonymousClass8PH.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", A0d17);
                case 3:
                    return new AnonymousClass8PH();
                case 4:
                    return new C171508Kg();
                case 5:
                    return AnonymousClass8PH.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0439 = AnonymousClass8PH.PARSER;
                    if (r0439 != null) {
                        return r0439;
                    }
                    synchronized (AnonymousClass8PH.class) {
                        r014 = AnonymousClass8PH.PARSER;
                        if (r014 == null) {
                            C201979ko r0440 = C21072A7j.A01;
                            r014 = C90524aI.A0G(AnonymousClass8PH.DEFAULT_INSTANCE);
                            AnonymousClass8PH.PARSER = r014;
                        }
                    }
                    return r014;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PG) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d18 = A0d();
                    A0d18[1] = "displayText_";
                    A0d18[2] = "id_";
                    return A0B(AnonymousClass8PG.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", A0d18);
                case 3:
                    return new AnonymousClass8PG();
                case 4:
                    return new C171498Kf();
                case 5:
                    return AnonymousClass8PG.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0441 = AnonymousClass8PG.PARSER;
                    if (r0441 != null) {
                        return r0441;
                    }
                    synchronized (AnonymousClass8PG.class) {
                        r013 = AnonymousClass8PG.PARSER;
                        if (r013 == null) {
                            C201979ko r0442 = C21072A7j.A01;
                            r013 = C90524aI.A0G(AnonymousClass8PG.DEFAULT_INSTANCE);
                            AnonymousClass8PG.PARSER = r013;
                        }
                    }
                    return r013;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8PF) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0d19 = A0d();
                    A0d19[1] = "displayText_";
                    A0d19[2] = "phoneNumber_";
                    return A0B(AnonymousClass8PF.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", A0d19);
                case 3:
                    return new AnonymousClass8PF();
                case 4:
                    return new C171488Ke();
                case 5:
                    return AnonymousClass8PF.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0443 = AnonymousClass8PF.PARSER;
                    if (r0443 != null) {
                        return r0443;
                    }
                    synchronized (AnonymousClass8PF.class) {
                        r012 = AnonymousClass8PF.PARSER;
                        if (r012 == null) {
                            C201979ko r0444 = C21072A7j.A01;
                            r012 = C90524aI.A0G(AnonymousClass8PF.DEFAULT_INSTANCE);
                            AnonymousClass8PF.PARSER = r012;
                        }
                    }
                    return r012;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173128Qm) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0f11 = A0f();
                    A0f11[1] = "xDeprecated_";
                    A0f11[2] = "yDeprecated_";
                    A0f11[3] = "x_";
                    A0f11[4] = "y_";
                    return A0B(C173128Qm.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003က\u0002\u0004က\u0003", A0f11);
                case 3:
                    return new C173128Qm();
                case 4:
                    return new C171468Kc();
                case 5:
                    return C173128Qm.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0445 = C173128Qm.PARSER;
                    if (r0445 != null) {
                        return r0445;
                    }
                    synchronized (C173128Qm.class) {
                        r011 = C173128Qm.PARSER;
                        if (r011 == null) {
                            C201979ko r0446 = C21072A7j.A01;
                            r011 = C90524aI.A0G(C173128Qm.DEFAULT_INSTANCE);
                            C173128Qm.PARSER = r011;
                        }
                    }
                    return r011;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8QC) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0e21 = A0e();
                    A0e21[1] = "value_";
                    A0e21[2] = "offset_";
                    A0e21[3] = "currencyCode_";
                    return A0B(AnonymousClass8QC.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဋ\u0001\u0003ဈ\u0002", A0e21);
                case 3:
                    return new AnonymousClass8QC();
                case 4:
                    return new C171458Kb();
                case 5:
                    return AnonymousClass8QC.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0447 = AnonymousClass8QC.PARSER;
                    if (r0447 != null) {
                        return r0447;
                    }
                    synchronized (AnonymousClass8QC.class) {
                        r010 = AnonymousClass8QC.PARSER;
                        if (r010 == null) {
                            C201979ko r0448 = C21072A7j.A01;
                            r010 = C90524aI.A0G(AnonymousClass8QC.DEFAULT_INSTANCE);
                            AnonymousClass8QC.PARSER = r010;
                        }
                    }
                    return r010;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof C173348Ri) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z22 = C90474aD.A1Z(9);
                    A1Z22[1] = "deviceListMetadata_";
                    A1Z22[2] = "deviceListMetadataVersion_";
                    A1Z22[3] = "messageSecret_";
                    A1Z22[4] = "paddingBytes_";
                    A1Z22[5] = "messageAddOnDurationInSecs_";
                    A1Z22[6] = "botMessageSecret_";
                    A1Z22[7] = "botMetadata_";
                    A1Z22[8] = "reportingTokenVersion_";
                    return A0B(C173348Ri.DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004\u0006ည\u0005\u0007ဉ\u0006\bင\u0007", A1Z22);
                case 3:
                    return new C173348Ri();
                case 4:
                    return new AnonymousClass8N8();
                case 5:
                    return C173348Ri.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0449 = C173348Ri.PARSER;
                    if (r0449 != null) {
                        return r0449;
                    }
                    synchronized (C173348Ri.class) {
                        r09 = C173348Ri.PARSER;
                        if (r09 == null) {
                            C201979ko r0450 = C21072A7j.A01;
                            r09 = C90524aI.A0G(C173348Ri.DEFAULT_INSTANCE);
                            C173348Ri.PARSER = r09;
                        }
                    }
                    return r09;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8SE) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z23 = C90474aD.A1Z(28);
                    A1Z23[1] = "url_";
                    AnonymousClass8S5.A0i(A1Z23, "mimetype_");
                    A1Z23[5] = "seconds_";
                    A1Z23[6] = "mediaKey_";
                    A1Z23[7] = "caption_";
                    A1Z23[8] = "gifPlayback_";
                    A1Z23[9] = "height_";
                    A1Z23[10] = "width_";
                    A1Z23[11] = "fileEncSha256_";
                    A1Z23[12] = "interactiveAnnotations_";
                    Class<C173058Qf> cls2 = C173058Qf.class;
                    A1Z23[13] = cls2;
                    A1Z23[14] = "directPath_";
                    A1Z23[15] = "mediaKeyTimestamp_";
                    A1Z23[16] = "jpegThumbnail_";
                    A1Z23[17] = "contextInfo_";
                    A1Z23[18] = "streamingSidecar_";
                    A1Z23[19] = "gifAttribution_";
                    A1Z23[20] = A7A.A00;
                    A1Z23[21] = "viewOnce_";
                    A1Z23[22] = "thumbnailDirectPath_";
                    A1Z23[23] = "thumbnailSha256_";
                    A1Z23[24] = "thumbnailEncSha256_";
                    A1Z23[25] = "staticUrl_";
                    A1Z23[26] = "annotations_";
                    A1Z23[27] = cls2;
                    return A0B(AnonymousClass8SE.DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ည\u0005\u0007ဈ\u0006\bဇ\u0007\tဋ\b\nဋ\t\u000bည\n\f\u001b\rဈ\u000b\u000eဂ\f\u0010ည\r\u0011ဉ\u000e\u0012ည\u000f\u0013ဌ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ည\u0013\u0017ည\u0014\u0018ဈ\u0015\u0019\u001b", A1Z23);
                case 3:
                    return new AnonymousClass8SE();
                case 4:
                    return new AnonymousClass8NH();
                case 5:
                    return AnonymousClass8SE.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0451 = AnonymousClass8SE.PARSER;
                    if (r0451 != null) {
                        return r0451;
                    }
                    synchronized (AnonymousClass8SE.class) {
                        r08 = AnonymousClass8SE.PARSER;
                        if (r08 == null) {
                            C201979ko r0452 = C21072A7j.A01;
                            r08 = C90524aI.A0G(AnonymousClass8SE.DEFAULT_INSTANCE);
                            AnonymousClass8SE.PARSER = r08;
                        }
                    }
                    return r08;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8SL) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr3 = new Object[9];
                    objArr3[0] = "format_";
                    A0Z(objArr3, "formatCase_");
                    objArr3[3] = AnonymousClass8SM.class;
                    objArr3[4] = AnonymousClass8SO.class;
                    objArr3[5] = "contextInfo_";
                    objArr3[6] = "hydratedTemplate_";
                    objArr3[7] = AnonymousClass8SV.class;
                    objArr3[8] = "templateId_";
                    return A0B(AnonymousClass8SL.DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဉ\u0003\u0004ဉ\u0004\u0005ြ\u0000\tဈ\u0005", objArr3);
                case 3:
                    return new AnonymousClass8SL();
                case 4:
                    return new AnonymousClass8N6();
                case 5:
                    return AnonymousClass8SL.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0453 = AnonymousClass8SL.PARSER;
                    if (r0453 != null) {
                        return r0453;
                    }
                    synchronized (AnonymousClass8SL.class) {
                        r07 = AnonymousClass8SL.PARSER;
                        if (r07 == null) {
                            C201979ko r0454 = C21072A7j.A01;
                            r07 = C90524aI.A0G(AnonymousClass8SL.DEFAULT_INSTANCE);
                            AnonymousClass8SL.PARSER = r07;
                        }
                    }
                    return r07;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8SO) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr4 = new Object[13];
                    objArr4[0] = "title_";
                    A0Z(objArr4, "titleCase_");
                    objArr4[3] = AnonymousClass8SC.class;
                    objArr4[4] = AnonymousClass8SF.class;
                    objArr4[5] = AnonymousClass8SE.class;
                    objArr4[6] = C173508Ry.class;
                    objArr4[7] = "hydratedContentText_";
                    objArr4[8] = "hydratedFooterText_";
                    objArr4[9] = "hydratedButtons_";
                    objArr4[10] = AnonymousClass8SJ.class;
                    objArr4[11] = "templateId_";
                    objArr4[12] = "maskLinkedDevices_";
                    return A0B(AnonymousClass8SO.DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0001\u0000\u0001ြ\u0000\u0002ျ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဈ\u0005\u0007ဈ\u0006\b\u001b\tဈ\u0007\nဇ\b", objArr4);
                case 3:
                    return new AnonymousClass8SO();
                case 4:
                    return new AnonymousClass8N7();
                case 5:
                    return AnonymousClass8SO.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0455 = AnonymousClass8SO.PARSER;
                    if (r0455 != null) {
                        return r0455;
                    }
                    synchronized (AnonymousClass8SO.class) {
                        r06 = AnonymousClass8SO.PARSER;
                        if (r06 == null) {
                            C201979ko r0456 = C21072A7j.A01;
                            r06 = C90524aI.A0G(AnonymousClass8SO.DEFAULT_INSTANCE);
                            AnonymousClass8SO.PARSER = r06;
                        }
                    }
                    return r06;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8SM) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr5 = new Object[12];
                    objArr5[0] = "title_";
                    A0Z(objArr5, "titleCase_");
                    objArr5[3] = AnonymousClass8SC.class;
                    objArr5[4] = C173398Rn.class;
                    objArr5[5] = AnonymousClass8SF.class;
                    objArr5[6] = AnonymousClass8SE.class;
                    objArr5[7] = C173508Ry.class;
                    objArr5[8] = "content_";
                    objArr5[9] = "footer_";
                    objArr5[10] = "buttons_";
                    objArr5[11] = AnonymousClass8QX.class;
                    return A0B(AnonymousClass8SM.DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0001\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဉ\u0005\u0007ဉ\u0006\b\u001b", objArr5);
                case 3:
                    return new AnonymousClass8SM();
                case 4:
                    return new C171448Ka();
                case 5:
                    return AnonymousClass8SM.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0457 = AnonymousClass8SM.PARSER;
                    if (r0457 != null) {
                        return r0457;
                    }
                    synchronized (AnonymousClass8SM.class) {
                        r05 = AnonymousClass8SM.PARSER;
                        if (r05 == null) {
                            C201979ko r0458 = C21072A7j.A01;
                            r05 = C90524aI.A0G(AnonymousClass8SM.DEFAULT_INSTANCE);
                            AnonymousClass8SM.PARSER = r05;
                        }
                    }
                    return r05;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8RH) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0g10 = A0g();
                    A0g10[1] = "selectedId_";
                    A0g10[2] = "selectedDisplayText_";
                    A0g10[3] = "contextInfo_";
                    A0g10[4] = "selectedIndex_";
                    A0g10[5] = "selectedCarouselCardIndex_";
                    return A0B(AnonymousClass8RH.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A0g10);
                case 3:
                    return new AnonymousClass8RH();
                case 4:
                    return new AnonymousClass8KZ();
                case 5:
                    return AnonymousClass8RH.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0459 = AnonymousClass8RH.PARSER;
                    if (r0459 != null) {
                        return r0459;
                    }
                    synchronized (AnonymousClass8RH.class) {
                        r04 = AnonymousClass8RH.PARSER;
                        if (r04 == null) {
                            C201979ko r0460 = C21072A7j.A01;
                            r04 = C90524aI.A0G(AnonymousClass8RH.DEFAULT_INSTANCE);
                            AnonymousClass8RH.PARSER = r04;
                        }
                    }
                    return r04;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8SA) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1Z24 = C90474aD.A1Z(20);
                    A0Y(A1Z24);
                    A1Z24[10] = "mediaKeyTimestamp_";
                    A1Z24[11] = "firstFrameLength_";
                    A1Z24[12] = "firstFrameSidecar_";
                    A1Z24[13] = "isAnimated_";
                    A1Z24[14] = "pngThumbnail_";
                    A1Z24[15] = "contextInfo_";
                    A1Z24[16] = "stickerSentTs_";
                    A1Z24[17] = "isAvatar_";
                    A1Z24[18] = "isAiSticker_";
                    A1Z24[19] = "isLottie_";
                    return A0B(AnonymousClass8SA.DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဈ\u0007\tဃ\b\nဂ\t\u000bဋ\n\fည\u000b\rဇ\f\u0010ည\r\u0011ဉ\u000e\u0012ဂ\u000f\u0013ဇ\u0010\u0014ဇ\u0011\u0015ဇ\u0012", A1Z24);
                case 3:
                    return new AnonymousClass8SA();
                case 4:
                    return new AnonymousClass8N5();
                case 5:
                    return AnonymousClass8SA.DEFAULT_INSTANCE;
                case 6:
                    AnonymousClass7cS r0461 = AnonymousClass8SA.PARSER;
                    if (r0461 != null) {
                        return r0461;
                    }
                    synchronized (AnonymousClass8SA.class) {
                        r03 = AnonymousClass8SA.PARSER;
                        if (r03 == null) {
                            C201979ko r0462 = C21072A7j.A01;
                            r03 = C90524aI.A0G(AnonymousClass8SA.DEFAULT_INSTANCE);
                            AnonymousClass8SA.PARSER = r03;
                        }
                    }
                    return r03;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else {
            boolean z = this instanceof AnonymousClass8PE;
            int intValue = num.intValue();
            if (z) {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        Object[] A0d20 = A0d();
                        A0d20[1] = "groupId_";
                        A0d20[2] = "axolotlSenderKeyDistributionMessage_";
                        return A0B(AnonymousClass8PE.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", A0d20);
                    case 3:
                        return new AnonymousClass8PE();
                    case 4:
                        return new AnonymousClass8N4();
                    case 5:
                        return AnonymousClass8PE.DEFAULT_INSTANCE;
                    case 6:
                        AnonymousClass7cS r0463 = AnonymousClass8PE.PARSER;
                        if (r0463 != null) {
                            return r0463;
                        }
                        synchronized (AnonymousClass8PE.class) {
                            r02 = AnonymousClass8PE.PARSER;
                            if (r02 == null) {
                                C201979ko r0464 = C21072A7j.A01;
                                r02 = C90524aI.A0G(AnonymousClass8PE.DEFAULT_INSTANCE);
                                AnonymousClass8PE.PARSER = r02;
                            }
                        }
                        return r02;
                    default:
                        throw AnonymousClass001.A0D();
                }
            } else {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        Object[] A0e22 = A0e();
                        A0e22[1] = "noteMessage_";
                        A0e22[2] = "requestMessageKey_";
                        A0e22[3] = "background_";
                        return A0B(AnonymousClass8QB.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", A0e22);
                    case 3:
                        return new AnonymousClass8QB();
                    case 4:
                        return new AnonymousClass8KY();
                    case 5:
                        return AnonymousClass8QB.DEFAULT_INSTANCE;
                    case 6:
                        AnonymousClass7cS r0465 = AnonymousClass8QB.PARSER;
                        if (r0465 != null) {
                            return r0465;
                        }
                        synchronized (AnonymousClass8QB.class) {
                            r0 = AnonymousClass8QB.PARSER;
                            if (r0 == null) {
                                C201979ko r0466 = C21072A7j.A01;
                                r0 = C90524aI.A0G(AnonymousClass8QB.DEFAULT_INSTANCE);
                                AnonymousClass8QB.PARSER = r0;
                            }
                        }
                        return r0;
                    default:
                        throw AnonymousClass001.A0D();
                }
            }
        }
    }
}
