.class public final Lcom/tencent/mm/d/a/dq;
.super Lcom/tencent/mm/sdk/c/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/d/a/dq$b;,
        Lcom/tencent/mm/d/a/dq$a;
    }
.end annotation


# static fields
.field public static arQ:Z

.field public static arR:Z


# instance fields
.field public axs:Lcom/tencent/mm/d/a/dq$a;

.field public axt:Lcom/tencent/mm/d/a/dq$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 6
    sput-boolean v0, Lcom/tencent/mm/d/a/dq;->arQ:Z

    .line 7
    sput-boolean v0, Lcom/tencent/mm/d/a/dq;->arR:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/tencent/mm/sdk/c/b;-><init>()V

    .line 13
    new-instance v0, Lcom/tencent/mm/d/a/dq$a;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/dq$a;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/dq;->axs:Lcom/tencent/mm/d/a/dq$a;

    .line 19
    new-instance v0, Lcom/tencent/mm/d/a/dq$b;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/dq$b;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/dq;->axt:Lcom/tencent/mm/d/a/dq$b;

    .line 8
    const-string/jumbo v0, "ExtSimpleRecord"

    iput-object v0, p0, Lcom/tencent/mm/d/a/dq;->id:Ljava/lang/String;

    sget-boolean v0, Lcom/tencent/mm/d/a/dq;->arR:Z

    iput-boolean v0, p0, Lcom/tencent/mm/d/a/dq;->jUI:Z

    return-void
.end method
