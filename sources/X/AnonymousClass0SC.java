package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0SC  reason: invalid class name */
public abstract class AnonymousClass0SC {
    public static final int A00;
    public static final int A01;
    public static final C15560nX A02 = new C15560nX((C12960iw) null, (C15560nX) null, 0, -1);
    public static final AnonymousClass035 A03 = AnonymousClass035.A00("BUFFERED");
    public static final AnonymousClass035 A04 = AnonymousClass035.A00("CHANNEL_CLOSED");
    public static final AnonymousClass035 A05 = AnonymousClass035.A00("CLOSE_HANDLER_CLOSED");
    public static final AnonymousClass035 A06 = AnonymousClass035.A00("CLOSE_HANDLER_INVOKED");
    public static final AnonymousClass035 A07 = AnonymousClass035.A00("DONE_RCV");
    public static final AnonymousClass035 A08 = AnonymousClass035.A00("FAILED");
    public static final AnonymousClass035 A09 = AnonymousClass035.A00("INTERRUPTED_RCV");
    public static final AnonymousClass035 A0A = AnonymousClass035.A00("INTERRUPTED_SEND");
    public static final AnonymousClass035 A0B = AnonymousClass035.A00("SHOULD_BUFFER");
    public static final AnonymousClass035 A0C = AnonymousClass035.A00("NO_CLOSE_CAUSE");
    public static final AnonymousClass035 A0D = AnonymousClass035.A00("NO_RECEIVE_RESULT");
    public static final AnonymousClass035 A0E = AnonymousClass035.A00("POISONED");
    public static final AnonymousClass035 A0F = AnonymousClass035.A00("RESUMING_BY_EB");
    public static final AnonymousClass035 A0G = AnonymousClass035.A00("S_RESUMING_BY_RCV");
    public static final AnonymousClass035 A0H = AnonymousClass035.A00("SUSPEND");
    public static final AnonymousClass035 A0I = AnonymousClass035.A00("SUSPEND_NO_WAITER");

    static {
        long j = (long) 1;
        long j2 = (long) Integer.MAX_VALUE;
        A01 = (int) AnonymousClass030.A00("kotlinx.coroutines.bufferedChannel.segmentSize", (long) 32, j, j2);
        A00 = (int) AnonymousClass030.A00("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", (long) SearchActionVerificationClientService.NOTIFICATION_ID, j, j2);
    }
}
