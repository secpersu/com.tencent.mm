.class final Lcom/tencent/mm/pluginsdk/i/a/c/l$b;
.super Lcom/tencent/mm/pluginsdk/i/a/c/l$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/pluginsdk/i/a/c/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method protected constructor <init>(Lcom/tencent/mm/pluginsdk/i/a/c/j;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/tencent/mm/pluginsdk/i/a/c/l$a;-><init>(Lcom/tencent/mm/pluginsdk/i/a/c/j;)V

    .line 107
    return-void
.end method


# virtual methods
.method public final aLT()Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    const-string/jumbo v0, "ResDownload"

    return-object v0
.end method
