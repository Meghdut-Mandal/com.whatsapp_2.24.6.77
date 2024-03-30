package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Ok  reason: invalid class name and case insensitive filesystem */
public final class C153457Ok extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C159707jn $batchStickerDownloadListener;
    public final /* synthetic */ AtomicInteger $downloadedStickerCount;
    public final /* synthetic */ AnonymousClass68B $stickerPack;
    public final /* synthetic */ int $totalStickerCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153457Ok(AnonymousClass68B r2, C159707jn r3, AtomicInteger atomicInteger, int i) {
        super(0);
        this.$downloadedStickerCount = atomicInteger;
        this.$totalStickerCount = i;
        this.$batchStickerDownloadListener = r3;
        this.$stickerPack = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$batchStickerDownloadListener.Bdk(this.$stickerPack.A0F, (int) (((double) (((float) this.$downloadedStickerCount.getAndIncrement()) / ((float) this.$totalStickerCount))) * 100.0d));
        return AnonymousClass0AJ.A00;
    }
}
