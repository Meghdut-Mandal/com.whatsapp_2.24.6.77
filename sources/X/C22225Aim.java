package X;

import android.os.SystemClock;
import com.facebook.wearable.mediastream.client.state.MediaStreamServiceStateDelegate$handleFrameStallTimeout$1;
import com.meta.media.stream.proto.ConfigureAudioStreamResponse;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.CancellationException;

/* renamed from: X.Aim  reason: case insensitive filesystem */
public final class C22225Aim extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C197549bt $buffer;
    public final /* synthetic */ AnonymousClass8AI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22225Aim(C197549bt r2, AnonymousClass8AI r3) {
        super(0);
        this.$buffer = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ByteBuffer byteBuffer;
        C006302t r2;
        Object r0;
        C006302t r22;
        C1887390n r02;
        Object r1;
        Object obj;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        Object obj2;
        AnonymousClass912 r03;
        AnonymousClass8AI r12;
        int i;
        C172548Og r23;
        C1888190v r04;
        Object obj3;
        Throwable aat;
        C1887190l r05;
        C006302t r13;
        Object obj4;
        C197549bt r24 = this.$buffer;
        int i2 = r24.A01;
        if (i2 == 1) {
            C200159gk r3 = AnonymousClass9AO.A01;
            r3.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CODEC_CONFIGURATION_UPDATE_REQUEST");
            C172788Pe r5 = (C172788Pe) C170918Hz.A07(C172788Pe.DEFAULT_INSTANCE, this.$buffer.A00);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(r5.config_.A02());
            AnonymousClass8I5 r06 = (AnonymousClass8I5) r5.config_;
            allocateDirect.put(r06.bytes, r06.A07(), r06.A02());
            allocateDirect.flip();
            int i3 = r5.type_;
            if (i3 == 0) {
                r05 = C1887190l.CODEC_TYPE_NONE;
            } else if (i3 == 1) {
                r05 = C1887190l.CODEC_TYPE_AUDIO;
            } else if (i3 != 2) {
                r05 = C1887190l.UNRECOGNIZED;
            } else {
                r05 = C1887190l.CODEC_TYPE_VIDEO;
            }
            int ordinal = r05.ordinal();
            if (ordinal == 1) {
                AnonymousClass8AI r14 = this.this$0;
                if (allocateDirect.isDirect()) {
                    r13 = r14.A00.A0M;
                    obj4 = new C1694389e(allocateDirect);
                } else {
                    throw AnonymousClass001.A08("Buffer must be direct");
                }
            } else if (ordinal != 2) {
                r3.A04(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received codec configuration update with unrecognized type!", (Throwable) null);
            } else {
                AnonymousClass8AI r15 = this.this$0;
                if (allocateDirect.isDirect()) {
                    r13 = r15.A00.A0M;
                    obj4 = new AnonymousClass89m(allocateDirect);
                } else {
                    throw AnonymousClass001.A08("Buffer must be direct");
                }
            }
            r13.invoke(obj4);
        } else {
            if (i2 == 4) {
                AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CONFIGURE_AUDIO_STREAM_RESPONSE");
                ConfigureAudioStreamResponse parseFrom = ConfigureAudioStreamResponse.parseFrom(this.$buffer.A00);
                r12 = this.this$0;
                i = parseFrom.getNonce();
                r23 = parseFrom.getError();
            } else {
                if (i2 == 6) {
                    AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CONFIGURE_VIDEO_STREAM_RESPONSE");
                    C172498Ob r07 = (C172498Ob) C170918Hz.A07(C172498Ob.DEFAULT_INSTANCE, this.$buffer.A00);
                    r12 = this.this$0;
                    i = r07.nonce_;
                    r23 = r07.error_;
                } else if (i2 == 8) {
                    AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CONTROL_STREAM_RESPONSE");
                    C172528Oe r08 = (C172528Oe) C170918Hz.A07(C172528Oe.DEFAULT_INSTANCE, this.$buffer.A00);
                    r12 = this.this$0;
                    i = r08.nonce_;
                    r23 = r08.error_;
                } else {
                    if (i2 == 13) {
                        AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CONTROL_STREAM_STOPPED");
                        C007403e r16 = this.this$0.A00.A01.A0I;
                        if (r16 != null) {
                            r16.B2S((CancellationException) null);
                        }
                        r22 = this.this$0.A00.A0L;
                        switch (((C172538Of) C170918Hz.A07(C172538Of.DEFAULT_INSTANCE, this.$buffer.A00)).reason_) {
                            case 0:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_UNKNOWN;
                                break;
                            case 1:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_USER_INITIATED;
                                break;
                            case 2:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_SYSTEM_PREEMPT;
                                break;
                            case 3:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_SYSTEM_SHUTDOWN;
                                break;
                            case 4:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_BATTERY_LOW;
                                break;
                            case 5:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_THERMAL_THRESHOLD;
                                break;
                            case 6:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_INACTIVITY;
                                break;
                            case 7:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_CAMERA_FAILURE;
                                break;
                            case 8:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_DOFF;
                                break;
                            case 9:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_CLOSE_ARMS;
                                break;
                            case 10:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_AUDIO_FAILURE;
                                break;
                            case 11:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_MOBILE_STREAM_ERROR;
                                break;
                            case 12:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_PEAK_POWER_INTERRUPT;
                                break;
                            case 13:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_USER_PAUSE;
                                break;
                            case 14:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_TAMPER_DETECTED;
                                break;
                            case 15:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_HARDWARE_TOGGLE;
                                break;
                            case 16:
                                r03 = AnonymousClass912.STREAM_STOPPED_REASON_SYSTEM_SHUTDOWN_BATTERY;
                                break;
                            default:
                                r03 = AnonymousClass912.UNRECOGNIZED;
                                break;
                        }
                        r1 = new AnonymousClass89Q(r03.ordinal());
                    } else {
                        if (i2 == 9) {
                            byteBuffer2 = r24.A00;
                            if (byteBuffer2 != null) {
                                AnonymousClass8AI r32 = this.this$0;
                                int remaining = r32.A00.A01.A09.remaining();
                                int remaining2 = byteBuffer2.remaining();
                                AnonymousClass84B r09 = r32.A00;
                                if (remaining >= remaining2) {
                                    byteBuffer3 = r09.A01.A09;
                                } else {
                                    AnonymousClass9Y3 r17 = r09.A01;
                                    r17.A09 = AnonymousClass8AI.A03(r17.A09, byteBuffer2);
                                }
                            }
                        } else {
                            if (i2 == 11) {
                                ByteBuffer byteBuffer4 = r24.A00;
                                if (byteBuffer4 != null) {
                                    AnonymousClass8AI r33 = this.this$0;
                                    int remaining3 = r33.A00.A01.A09.remaining();
                                    int remaining4 = byteBuffer4.remaining();
                                    AnonymousClass84B r010 = r33.A00;
                                    if (remaining3 >= remaining4) {
                                        r010.A01.A09.put(byteBuffer4);
                                    } else {
                                        AnonymousClass9Y3 r18 = r010.A01;
                                        r18.A09 = AnonymousClass8AI.A03(r18.A09, byteBuffer4);
                                    }
                                }
                                this.this$0.A00.A01.A09.flip();
                                AnonymousClass8AI r34 = this.this$0;
                                ByteBuffer byteBuffer5 = r34.A00.A01.A09;
                                try {
                                    byteBuffer5.order(ByteOrder.LITTLE_ENDIAN);
                                    obj2 = new AnonymousClass881(byteBuffer5, byteBuffer5.getLong());
                                } catch (Throwable th) {
                                    obj2 = C90524aI.A0t(th);
                                }
                                AnonymousClass0AN.A00(obj2);
                                AnonymousClass881 r7 = (AnonymousClass881) obj2;
                                AnonymousClass84B r8 = r34.A00;
                                C197559bu r6 = r8.A0I;
                                long j = r7.A00;
                                Long l = r6.A00;
                                if (l == null) {
                                    l = C90504aG.A0h(SystemClock.elapsedRealtime() * ((long) 1000), j);
                                }
                                r6.A00 = l;
                                if (l != null) {
                                    j += l.longValue();
                                }
                                r7.A00 = j;
                                C006302t r4 = r8.A0M;
                                ByteBuffer asReadOnlyBuffer = r7.A01.asReadOnlyBuffer();
                                AnonymousClass00C.A08(asReadOnlyBuffer);
                                r4.invoke(new AnonymousClass89n(asReadOnlyBuffer, r7.A00));
                                byteBuffer = this.this$0.A00.A01.A09;
                            } else if (i2 == 10) {
                                byteBuffer2 = r24.A00;
                                if (byteBuffer2 != null) {
                                    AnonymousClass8AI r35 = this.this$0;
                                    int remaining5 = r35.A00.A01.A0A.remaining();
                                    int remaining6 = byteBuffer2.remaining();
                                    AnonymousClass84B r011 = r35.A00;
                                    if (remaining5 >= remaining6) {
                                        byteBuffer3 = r011.A01.A0A;
                                    } else {
                                        AnonymousClass9Y3 r19 = r011.A01;
                                        r19.A0A = AnonymousClass8AI.A03(r19.A0A, byteBuffer2);
                                    }
                                }
                            } else if (i2 == 12) {
                                ByteBuffer byteBuffer6 = r24.A00;
                                if (byteBuffer6 != null) {
                                    AnonymousClass8AI r36 = this.this$0;
                                    int remaining7 = r36.A00.A01.A0A.remaining();
                                    int remaining8 = byteBuffer6.remaining();
                                    AnonymousClass84B r012 = r36.A00;
                                    if (remaining7 >= remaining8) {
                                        r012.A01.A0A.put(byteBuffer6);
                                    } else {
                                        AnonymousClass9Y3 r110 = r012.A01;
                                        r110.A0A = AnonymousClass8AI.A03(r110.A0A, byteBuffer6);
                                    }
                                }
                                this.this$0.A00.A01.A0A.flip();
                                AnonymousClass8AI r82 = this.this$0;
                                ByteBuffer byteBuffer7 = r82.A00.A01.A0A;
                                try {
                                    byteBuffer7.order(ByteOrder.LITTLE_ENDIAN);
                                    obj = new AnonymousClass881(byteBuffer7, byteBuffer7.getLong());
                                } catch (Throwable th2) {
                                    obj = C90524aI.A0t(th2);
                                }
                                AnonymousClass0AN.A00(obj);
                                AnonymousClass881 r52 = (AnonymousClass881) obj;
                                AnonymousClass84B r42 = r82.A00;
                                C197559bu r9 = r42.A0I;
                                long j2 = r52.A00;
                                Long l2 = r9.A01;
                                if (l2 == null) {
                                    l2 = C90504aG.A0h(SystemClock.uptimeMillis() * ((long) 1000), j2);
                                }
                                r9.A01 = l2;
                                if (l2 != null) {
                                    j2 += l2.longValue();
                                }
                                r52.A00 = j2;
                                AnonymousClass9Y3 r37 = r42.A01;
                                C007403e r111 = r37.A0I;
                                if (r111 != null) {
                                    r111.B2S((CancellationException) null);
                                }
                                C195999Xe A03 = r42.A03();
                                AnonymousClass00C.A08(A03);
                                if (A03.equals(AnonymousClass9QJ.A00(r42.A0E, r42, AnonymousClass84B.A0S, 8))) {
                                    C005502l r013 = C006702x.A00;
                                    r37.A0I = C36391kE.A12(new MediaStreamServiceStateDelegate$handleFrameStallTimeout$1(r82, (C023509x) null), C009403z.A02(AnonymousClass03K.A00));
                                }
                                C006302t r43 = r42.A0M;
                                ByteBuffer asReadOnlyBuffer2 = r52.A01.asReadOnlyBuffer();
                                AnonymousClass00C.A08(asReadOnlyBuffer2);
                                r43.invoke(new AnonymousClass89o(asReadOnlyBuffer2, r52.A00));
                                byteBuffer = this.this$0.A00.A01.A0A;
                            } else if (i2 == 22) {
                                AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_SUPPORTED_CONFIGURATION_UPDATE_REQUEST");
                                r22 = this.this$0.A00.A0M;
                                int i4 = ((C172558Oh) C170918Hz.A07(C172558Oh.DEFAULT_INSTANCE, this.$buffer.A00)).videoQuality_;
                                if (i4 == 0) {
                                    r02 = C1887390n.VIDEO_QUALITY_LOW;
                                } else if (i4 == 1) {
                                    r02 = C1887390n.VIDEO_QUALITY_MEDIUM;
                                } else if (i4 != 2) {
                                    r02 = C1887390n.UNRECOGNIZED;
                                } else {
                                    r02 = C1887390n.VIDEO_QUALITY_HIGH;
                                }
                                r1 = new C1694789i(r02.ordinal());
                            } else {
                                if (i2 == 25) {
                                    AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_STREAM_TELEMETRY_EVENT");
                                    ByteBuffer byteBuffer8 = this.$buffer.A00;
                                    if (byteBuffer8 != null) {
                                        r2 = this.this$0.A00.A0M;
                                        r0 = new C1694689h(byteBuffer8);
                                    }
                                } else if (i2 == 21) {
                                    AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_SYSTEM_HEALTH_EVENT");
                                    ByteBuffer byteBuffer9 = this.$buffer.A00;
                                    if (byteBuffer9 != null) {
                                        r2 = this.this$0.A00.A0M;
                                        r0 = new C1694889j(byteBuffer9);
                                    }
                                } else if (i2 == 23) {
                                    AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_USER_EVENT_NOTIFICATION");
                                    ByteBuffer byteBuffer10 = this.$buffer.A00;
                                    if (byteBuffer10 != null) {
                                        r2 = this.this$0.A00.A0M;
                                        r0 = new C1695089l(byteBuffer10);
                                    }
                                } else if (i2 == 17) {
                                    AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_USER_ENGAGEMENT_REQUEST");
                                    ByteBuffer byteBuffer11 = this.$buffer.A00;
                                    if (byteBuffer11 != null) {
                                        r2 = this.this$0.A00.A0M;
                                        r0 = new C1694489f(byteBuffer11);
                                    }
                                } else if (i2 == 31) {
                                    AnonymousClass9AO.A01.A02(this.this$0.A0A(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_MODEL_REQUEST");
                                    ByteBuffer byteBuffer12 = this.$buffer.A00;
                                    if (byteBuffer12 != null) {
                                        r2 = this.this$0.A00.A0M;
                                        r0 = new C1694589g(byteBuffer12);
                                    }
                                }
                                r2.invoke(r0);
                            }
                            byteBuffer.clear();
                        }
                        byteBuffer3.put(byteBuffer2);
                    }
                    r22.invoke(r1);
                }
                if (r23 == null) {
                    r23 = C172548Og.DEFAULT_INSTANCE;
                }
            }
            AnonymousClass00C.A08(r23);
            C006302t r38 = (C006302t) r12.A00.A01.A0J.remove(Integer.valueOf(i));
            if (r38 != null) {
                int i5 = r23.code_;
                if (i5 == 0) {
                    r04 = C1888190v.ERROR_CODE_SUCCESS;
                } else if (i5 == 1) {
                    r04 = C1888190v.ERROR_CODE_INTERNAL;
                } else if (i5 == 2) {
                    r04 = C1888190v.ERROR_CODE_INVALID_PARAMETER;
                } else if (i5 == 3) {
                    r04 = C1888190v.ERROR_CODE_UNSUPPORTED_PARAMETER;
                } else if (i5 == 4) {
                    r04 = C1888190v.ERROR_CODE_DOFF;
                } else if (i5 != 5) {
                    r04 = C1888190v.UNRECOGNIZED;
                } else {
                    r04 = C1888190v.ERROR_CODE_BUSY;
                }
                int ordinal2 = r04.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        aat = new C21817Aat(r23.reason_);
                    } else if (ordinal2 == 2) {
                        obj3 = new C1694089b(new C21817Aat(r23.reason_));
                    } else if (ordinal2 == 3) {
                        obj3 = new C1694189c(new C21817Aat(r23.reason_));
                    } else if (ordinal2 != 4) {
                        aat = new C21818Aau();
                    } else {
                        obj3 = new AnonymousClass89Z(new C21817Aat(r23.reason_));
                    }
                    obj3 = new C1693989a(aat);
                } else {
                    obj3 = C1694289d.A00;
                }
                r38.invoke(obj3);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
