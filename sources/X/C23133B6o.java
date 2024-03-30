package X;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.B6o  reason: case insensitive filesystem */
public class C23133B6o extends Handler {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23133B6o(Looper looper, Object obj, int i) {
        super(looper);
        this.A01 = i;
        this.A00 = obj;
    }

    public void handleMessage(Message message) {
        AnonymousClass9ME r1;
        View view;
        Message message2 = message;
        switch (this.A01) {
            case 0:
                if (message2.what == 1) {
                    PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) this.A00;
                    PreferenceScreen preferenceScreen = preferenceFragmentCompat.A01.A06;
                    if (preferenceScreen != null) {
                        preferenceFragmentCompat.A02.setAdapter(new C168137zl(preferenceScreen));
                        preferenceScreen.A07();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C202709mU r6 = (C202709mU) this.A00;
                int i = message2.what;
                boolean z = true;
                if (i == 0) {
                    C201399jS r7 = (C201399jS) message2.obj;
                    int i2 = message2.arg1;
                    int i3 = message2.arg2;
                    if (i3 == -1) {
                        z = false;
                    }
                    int i4 = r6.A02 - i2;
                    r6.A02 = i4;
                    if (i4 == 0) {
                        if (r7.A02 == -9223372036854775807L) {
                            r7 = r7.A01(r7.A04, 0, r7.A01);
                        }
                        if ((!AnonymousClass000.A1Q(r6.A07.A03.A01()) || r6.A0C) && AnonymousClass000.A1Q(r7.A03.A01())) {
                            r6.A00 = 0;
                            r6.A01 = 0;
                            r6.A05 = 0;
                            r6.A04 = 0;
                        }
                        int i5 = 2;
                        if (r6.A0C) {
                            i5 = 0;
                        }
                        boolean z2 = r6.A0D;
                        r6.A0C = false;
                        r6.A0D = false;
                        C202709mU.A02(r6, r7, i3, i5, z, z2);
                        return;
                    }
                    return;
                } else if (i == 1) {
                    C199519fS r4 = (C199519fS) message2.obj;
                    if (!r6.A08.equals(r4)) {
                        r6.A08 = r4;
                        Iterator it = r6.A0M.iterator();
                        while (it.hasNext()) {
                            C202979n2 r2 = ((AnonymousClass9UY) it.next()).A05;
                            float f = r2.A00;
                            float f2 = r4.A01;
                            if (f != f2) {
                                r2.A00 = f2;
                                r2.A0M.A0o.Bco(f2);
                            }
                        }
                        return;
                    }
                    return;
                } else if (i == 2) {
                    AnonymousClass82J r5 = (AnonymousClass82J) message2.obj;
                    r6.A06 = r5;
                    Iterator it2 = r6.A0M.iterator();
                    while (it2.hasNext()) {
                        C202979n2 r3 = ((AnonymousClass9UY) it2.next()).A05;
                        AnonymousClass902 r22 = null;
                        if (r5 != null) {
                            int i6 = r5.type;
                            if (i6 == 0) {
                                r22 = AnonymousClass902.A06;
                            } else if (i6 == 1) {
                                r22 = AnonymousClass902.A05;
                            } else if (i6 == 2) {
                                r22 = AnonymousClass902.A07;
                            }
                        }
                        r5.getCause();
                        for (B3J Bcr : r3.A0P) {
                            Bcr.Bcr(r5, r22);
                        }
                    }
                    return;
                } else if (i == 3) {
                    int i7 = r6.A03 - 1;
                    r6.A03 = i7;
                    if (i7 == 0) {
                        r6.A0F = AnonymousClass000.A1X(message2.obj);
                        Iterator it3 = r6.A0M.iterator();
                        while (it3.hasNext()) {
                            AnonymousClass9UY r23 = (AnonymousClass9UY) it3.next();
                            boolean z3 = r6.A0F;
                            if (z3) {
                                r23.A01(z3, r6.A07.A00);
                            }
                        }
                        return;
                    }
                    return;
                } else if (i == 4) {
                    Iterator it4 = r6.A0M.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                    }
                    return;
                } else if (i == 5) {
                    Iterator it5 = r6.A0M.iterator();
                    while (it5.hasNext()) {
                        String str = (String) message2.obj;
                        C202979n2 r42 = ((AnonymousClass9UY) it5.next()).A05;
                        B3Y b3y = r42.A02;
                        if (b3y instanceof C208929zB) {
                            StringBuilder A0i = C90524aI.A0i("LoadControl debug info: ");
                            A0i.append(((C208929zB) b3y).A09);
                            str = AnonymousClass000.A0p(". Player debug info: ", str, A0i);
                        }
                        for (B3J Bkc : r42.A0P) {
                            Bkc.Bkc(AnonymousClass902.A08, str);
                        }
                    }
                    return;
                } else {
                    throw C165617ti.A0V();
                }
            case 2:
                C202139l6 r0 = (C202139l6) this.A00;
                ArrayDeque arrayDeque = C202139l6.A07;
                int i8 = message2.what;
                if (i8 == 0) {
                    r1 = (AnonymousClass9ME) message2.obj;
                    r0.A02.queueInputBuffer(r1.A01, 0, r1.A02, r1.A03, r1.A00);
                } else if (i8 == 1) {
                    r1 = (AnonymousClass9ME) message2.obj;
                    int i9 = r1.A01;
                    MediaCodec.CryptoInfo cryptoInfo = r1.A04;
                    long j = r1.A03;
                    int i10 = r1.A00;
                    try {
                        synchronized (C202139l6.A06) {
                            r0.A02.queueSecureInputBuffer(i9, 0, cryptoInfo, j, i10);
                        }
                    } catch (RuntimeException e) {
                        r0.A05.compareAndSet((Object) null, e);
                    }
                } else if (i8 != 2) {
                    r0.A05.compareAndSet((Object) null, AnonymousClass001.A09(String.valueOf(i8)));
                    return;
                } else {
                    r0.A04.A01();
                    return;
                }
                ArrayDeque arrayDeque2 = C202139l6.A07;
                synchronized (arrayDeque2) {
                    arrayDeque2.add(r1);
                }
                return;
            case 3:
                SystemCounterThread systemCounterThread = (SystemCounterThread) this.A00;
                int i11 = message2.what;
                int i12 = message2.arg1;
                synchronized (systemCounterThread) {
                    try {
                        if (systemCounterThread.mEnabled) {
                            if (i11 == 1) {
                                systemCounterThread.mSystemCounterLogger.A02();
                                systemCounterThread.logCounters();
                            } else if (i11 == 2) {
                                systemCounterThread.logHighFrequencyThreadCounters();
                            } else if (i11 == 3) {
                                systemCounterThread.logExpensiveCounters();
                            } else {
                                th = AnonymousClass001.A08("Unknown message type");
                                throw th;
                            }
                            systemCounterThread.mHandler.sendMessageDelayed(systemCounterThread.mHandler.obtainMessage(i11, i12, 0), (long) i12);
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                return;
            case 4:
                C225314u r32 = (C225314u) this.A00;
                r32.A05.A06(R.string.f12nameremoved, 0);
                view = r32.findViewById(R.id.progress_bar);
                break;
            case 5:
                C180818mT r33 = (C180818mT) this.A00;
                AnonymousClass17Y r24 = r33.A05;
                boolean A0G = r33.A09.A0G();
                int i13 = R.string.f12nameremoved;
                if (A0G) {
                    i13 = R.string.f12nameremoved;
                }
                r24.A06(i13, 0);
                view = r33.A00;
                break;
            default:
                int i14 = message2.what;
                if (i14 == 1) {
                    VoipPhysicalCamera voipPhysicalCamera = (VoipPhysicalCamera) this.A00;
                    C18740tg.A0D(AnonymousClass000.A1R((voipPhysicalCamera.lastCameraCallbackTs > 0 ? 1 : (voipPhysicalCamera.lastCameraCallbackTs == 0 ? 0 : -1))), "last camera callback ts should not be 0");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - voipPhysicalCamera.lastCameraCallbackTs;
                    if (elapsedRealtime > 2000) {
                        Locale locale = Locale.getDefault();
                        Object[] objArr = new Object[1];
                        AnonymousClass000.A1M(objArr, 0, elapsedRealtime);
                        Log.e(String.format(locale, "%dms since last callback, will try restarting camera.", objArr));
                        voipPhysicalCamera.stopOnCameraThread();
                        if (voipPhysicalCamera.startOnCameraThread() != 0) {
                            voipPhysicalCamera.stopOnCameraThread();
                        }
                    }
                    voipPhysicalCamera.startPeriodicCameraCallbackCheck();
                    return;
                } else if (i14 == 2) {
                    ((VoipPhysicalCamera) this.A00).onFrameAvailableOnCameraThread();
                    return;
                } else if (i14 == 3) {
                    ((VoipPhysicalCamera) this.A00).resendLastFrame();
                    return;
                } else {
                    return;
                }
        }
        view.setVisibility(8);
    }

    public C23133B6o(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A01 = 0;
        this.A00 = preferenceFragmentCompat;
    }
}
