.class public final Lcom/tencent/mm/d/a/q;
.super Lcom/tencent/mm/sdk/c/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/d/a/q$b;,
        Lcom/tencent/mm/d/a/q$a;
    }
.end annotation


# static fields
.field public static arQ:Z

.field public static arR:Z


# instance fields
.field public asx:Lcom/tencent/mm/d/a/q$a;

.field public asy:Lcom/tencent/mm/d/a/q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 6
    sput-boolean v0, Lcom/tencent/mm/d/a/q;->arQ:Z

    .line 7
    sput-boolean v0, Lcom/tencent/mm/d/a/q;->arR:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/tencent/mm/sdk/c/b;-><init>()V

    .line 13
    new-instance v0, Lcom/tencent/mm/d/a/q$a;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/q$a;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/q;->asx:Lcom/tencent/mm/d/a/q$a;

    .line 18
    new-instance v0, Lcom/tencent/mm/d/a/q$b;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/q$b;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/q;->asy:Lcom/tencent/mm/d/a/q$b;

    .line 8
    const-string/jumbo v0, "BindQQ"

    iput-object v0, p0, Lcom/tencent/mm/d/a/q;->id:Ljava/lang/String;

    sget-boolean v0, Lcom/tencent/mm/d/a/q;->arR:Z

    iput-boolean v0, p0, Lcom/tencent/mm/d/a/q;->jUI:Z

    return-void
.end method
