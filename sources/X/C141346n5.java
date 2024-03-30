package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Iterator;

/* renamed from: X.6n5  reason: invalid class name and case insensitive filesystem */
public class C141346n5 implements C160937lp {
    public static final ByteBuffer A0K = C90474aD.A0l(0);
    public ByteBuffer A00;
    public int A01;
    public MediaCodec A02;
    public MediaFormat A03;
    public AnonymousClass6VP A04;
    public AnonymousClass6N2 A05;
    public C130736Mf A06;
    public ByteBuffer A07 = A0K;
    public boolean A08;
    public ByteBuffer[] A09;
    public ByteBuffer[] A0A;
    public C1271867h A0B;
    public final MediaCodec.BufferInfo A0C = new MediaCodec.BufferInfo();
    public final C125085zI A0D;
    public final AnonymousClass7ez A0E;
    public final C109645Yj A0F;
    public final C109655Yk A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public volatile long A0J;

    public AnonymousClass6D7 BDz() {
        return null;
    }

    public void BpZ(long j) {
        float f = (float) j;
        AnonymousClass6QD r0 = this.A0D.A05;
        if (r0 != null) {
            AnonymousClass67B r2 = new AnonymousClass67B(r0);
            r2.A00(AnonymousClass5TE.AUDIO, this.A01);
            C131736Qi.A02(AnonymousClass000.A1V(r2.A00), "No track is selected");
        }
        this.A0J = (long) (f * 1.0f);
        this.A02.flush();
        this.A07 = A0K;
        this.A0I = false;
        this.A08 = false;
        this.A04.A06(this.A0J);
    }

    public void cancel() {
        this.A0H = true;
    }

    public void start() {
    }

    private void A00() {
        C128956Eg A012;
        AnonymousClass6QD r2 = this.A0D.A05;
        if (r2 != null && (A012 = r2.A01(AnonymousClass5TE.AUDIO, this.A01)) != null) {
            Iterator it = A012.A02.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("getMediaEffect");
            }
        }
    }

    public void B3P(int i) {
        this.A01 = i;
        ByteBuffer[] byteBufferArr = this.A0B.A04;
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer == null) {
            byteBuffer = C90474aD.A0l(ZipDecompressor.UNZIP_BUFFER_SIZE);
            byteBufferArr[i] = byteBuffer;
        } else {
            byteBuffer.clear();
        }
        this.A00 = byteBuffer;
        AnonymousClass7ez r4 = this.A0E;
        C109655Yk r3 = this.A0G;
        C125085zI r2 = this.A0D;
        AnonymousClass6VP r0 = new AnonymousClass6VP(r4, r3, r2.A07);
        this.A04 = r0;
        C129266Gc.A01(r0, r2);
        this.A04.A07(AnonymousClass5TE.AUDIO);
        MediaFormat A042 = this.A04.A04();
        this.A02 = MediaCodec.createDecoderByType(A042.getString("mime"));
        if (A042.containsKey("encoder-delay") && A042.getInteger("encoder-delay") > 10000) {
            A042.setInteger("encoder-delay", 0);
        }
        this.A02.configure(A042, (Surface) null, (MediaCrypto) null, 0);
        this.A02.start();
        this.A09 = this.A02.getInputBuffers();
        this.A0A = this.A02.getOutputBuffers();
    }

    public void B58(long j) {
        int dequeueInputBuffer;
        int i;
        AnonymousClass6N2 r0;
        ByteBuffer byteBuffer;
        int i2;
        this.A00.clear();
        while (this.A00.hasRemaining() && !this.A08) {
            int min = Math.min(this.A00.remaining(), this.A07.remaining());
            if (min <= 0) {
                if (!this.A08) {
                    MediaCodec mediaCodec = this.A02;
                    MediaCodec.BufferInfo bufferInfo = this.A0C;
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 5000);
                    if (dequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            this.A08 = true;
                            C130736Mf r02 = this.A06;
                            if (r02 != null) {
                                C133086Wp r7 = r02.A00;
                                int i3 = r7.A00;
                                int i4 = r7.A05 + ((int) ((((((float) i3) / (1.0f / 1.0f)) + ((float) r7.A06)) / (r7.A0D * 1.0f)) + 0.5f));
                                short[] sArr = r7.A0A;
                                int i5 = r7.A0H * 2;
                                short[] A042 = C133086Wp.A04(r7, sArr, i3, i5 + i3);
                                r7.A0A = A042;
                                int i6 = 0;
                                while (true) {
                                    int i7 = r7.A0E;
                                    if (i6 >= i5 * i7) {
                                        break;
                                    }
                                    A042[(i7 * i3) + i6] = 0;
                                    i6++;
                                }
                                r7.A00 += i5;
                                C133086Wp.A01(r7);
                                if (r7.A05 > i4) {
                                    r7.A05 = i4;
                                }
                                r7.A00 = 0;
                                r7.A09 = 0;
                                r7.A06 = 0;
                            }
                        } else {
                            ByteBuffer byteBuffer2 = this.A0A[dequeueOutputBuffer];
                            C90464aC.A0s(bufferInfo, byteBuffer2);
                            C133086Wp r8 = this.A06.A00;
                            ShortBuffer asShortBuffer = byteBuffer2.asShortBuffer();
                            int remaining = asShortBuffer.remaining();
                            int i8 = r8.A0E;
                            int i9 = remaining / i8;
                            short[] A043 = C133086Wp.A04(r8, r8.A0A, r8.A00, i9);
                            r8.A0A = A043;
                            asShortBuffer.get(A043, r8.A00 * i8, ((i8 * i9) * 2) / 2);
                            r8.A00 += i9;
                            C133086Wp.A01(r8);
                            C130736Mf r82 = this.A06;
                            C133086Wp r9 = r82.A00;
                            int i10 = r9.A05 * r9.A0E * 2;
                            if (i10 > 0) {
                                if (r82.A01.capacity() < i10) {
                                    r82.A01 = C90474aD.A0l(i10);
                                } else {
                                    r82.A01.clear();
                                }
                                ShortBuffer asShortBuffer2 = r82.A01.asShortBuffer();
                                int remaining2 = asShortBuffer2.remaining();
                                int i11 = r9.A0E;
                                int min2 = Math.min(remaining2 / i11, r9.A05);
                                asShortBuffer2.put(r9.A0B, 0, i11 * min2);
                                int i12 = r9.A05 - min2;
                                r9.A05 = i12;
                                short[] sArr2 = r9.A0B;
                                System.arraycopy(sArr2, min2 * i11, sArr2, 0, i12 * i11);
                                r82.A01.limit(i10);
                                byteBuffer = r82.A01;
                            } else {
                                byteBuffer = C130736Mf.A02;
                            }
                            AnonymousClass6N2 r10 = this.A05;
                            if (r10 != null) {
                                int position = byteBuffer.position();
                                int limit = byteBuffer.limit();
                                int i13 = r10.A03;
                                int i14 = i13 * 2;
                                int i15 = ((limit - position) / i14) * 4;
                                if (r10.A01.capacity() < i15) {
                                    r10.A01 = C90474aD.A0l(i15);
                                } else {
                                    r10.A01.clear();
                                }
                                r10.A02 = r10.A01;
                                while (position < limit) {
                                    int i16 = 0;
                                    short s = 0;
                                    for (int i17 = 0; i17 < i13; i17++) {
                                        short s2 = byteBuffer.getShort((i17 * 2) + position);
                                        int i18 = AnonymousClass6N2.A04;
                                        int i19 = s + i18;
                                        int i20 = s2 + i18;
                                        if (i19 >= i18 || i20 >= i18) {
                                            i2 = (((i19 + i20) * 2) - ((i19 * i20) / i18)) - AnonymousClass6N2.A05;
                                        } else {
                                            i2 = (i19 * i20) / i18;
                                        }
                                        int i21 = AnonymousClass6N2.A05;
                                        if (i2 == i21) {
                                            i2 = i21 - 1;
                                        }
                                        s = (short) (i2 - i18);
                                    }
                                    do {
                                        r10.A02.putShort(s);
                                        i16++;
                                    } while (i16 < 2);
                                    position += i14;
                                }
                                byteBuffer.position(limit);
                                r10.A02.flip();
                                AnonymousClass6N2 r1 = this.A05;
                                byteBuffer = r1.A02;
                                r1.A02 = r1.A00;
                            }
                            this.A07 = byteBuffer;
                            this.A02.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.A0A = this.A02.getOutputBuffers();
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.A02.getOutputFormat();
                        this.A03 = outputFormat;
                        int integer = outputFormat.getInteger("channel-count");
                        if (integer != 2) {
                            r0 = new AnonymousClass6N2(integer);
                        } else {
                            r0 = null;
                        }
                        this.A05 = r0;
                        int integer2 = this.A03.getInteger("sample-rate");
                        int integer3 = this.A03.getInteger("channel-count");
                        C125085zI r12 = this.A0D;
                        ByteBuffer byteBuffer3 = C130736Mf.A02;
                        AnonymousClass6QD r03 = r12.A05;
                        if (r03 != null) {
                            AnonymousClass67B r2 = new AnonymousClass67B(r03);
                            r2.A00(AnonymousClass5TE.AUDIO, this.A01);
                            C131736Qi.A02(AnonymousClass000.A1V(r2.A00), "No track is selected");
                        }
                        A00();
                        this.A06 = new C130736Mf(integer2, integer3);
                    }
                }
                while (true) {
                    if (this.A0I || this.A0H || (dequeueInputBuffer = this.A02.dequeueInputBuffer(0)) < 0) {
                        break;
                    }
                    int A022 = this.A04.A02(this.A09[dequeueInputBuffer]);
                    if (A022 <= 0) {
                        this.A02.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                        this.A0I = true;
                        break;
                    }
                    C114965i7 r04 = this.A04.A05;
                    if (r04 != null) {
                        i = r04.A00.getSampleFlags();
                    } else {
                        i = -1;
                    }
                    this.A02.queueInputBuffer(dequeueInputBuffer, 0, A022, this.A04.A03(), i);
                    this.A04.A08();
                }
            } else {
                ByteBuffer duplicate = this.A07.duplicate();
                duplicate.limit(duplicate.position() + min);
                this.A00.put(duplicate);
                ByteBuffer byteBuffer4 = this.A07;
                byteBuffer4.position(byteBuffer4.position() + min);
            }
        }
        if (this.A06 != null) {
            A00();
        }
        while (true) {
            int position2 = this.A00.position();
            int limit2 = this.A00.limit();
            ByteBuffer byteBuffer5 = this.A00;
            if (position2 < limit2) {
                byteBuffer5.put((byte) 0);
            } else {
                byteBuffer5.flip();
                return;
            }
        }
    }

    public void release() {
        AnonymousClass6MV r2 = new AnonymousClass6MV();
        AnonymousClass60I.A00(new C162577oo(this.A02, r2));
        AnonymousClass60I.A00(new C162577oo(r2, this.A04));
        Throwable th = r2.A01;
        if (th == null) {
            this.A00 = null;
            this.A02 = null;
            return;
        }
        throw th;
    }

    public C141346n5(C1271867h r2, AnonymousClass7ez r3, C109645Yj r4, C109655Yk r5, C125085zI r6) {
        this.A0D = r6;
        this.A0B = r2;
        this.A0F = r4;
        this.A0E = r3;
        this.A0G = r5;
    }

    public long B57() {
        throw AnonymousClass001.A0D();
    }

    public long BAp() {
        throw AnonymousClass001.A0D();
    }

    public boolean BLY() {
        return this.A08;
    }
}
