.class public final Lcom/tencent/mm/protocal/s$a;
.super Lcom/tencent/mm/protocal/h$c;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/protocal/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/protocal/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public iVh:Lcom/tencent/mm/protocal/b/aeu;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/tencent/mm/protocal/h$c;-><init>()V

    .line 9
    new-instance v0, Lcom/tencent/mm/protocal/b/aeu;

    invoke-direct {v0}, Lcom/tencent/mm/protocal/b/aeu;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/protocal/s$a;->iVh:Lcom/tencent/mm/protocal/b/aeu;

    return-void
.end method


# virtual methods
.method public final getCmdId()I
    .locals 1

    .prologue
    .line 24
    const/16 v0, 0x1b

    return v0
.end method

.method public final tY()[B
    .locals 2

    .prologue
    .line 13
    iget-object v0, p0, Lcom/tencent/mm/protocal/s$a;->iVh:Lcom/tencent/mm/protocal/b/aeu;

    invoke-static {p0}, Lcom/tencent/mm/protocal/h;->a(Lcom/tencent/mm/protocal/h$c;)Lcom/tencent/mm/protocal/b/dc;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/mm/protocal/b/ali;->jGS:Lcom/tencent/mm/protocal/b/dc;

    .line 14
    iget-object v0, p0, Lcom/tencent/mm/protocal/s$a;->iVh:Lcom/tencent/mm/protocal/b/aeu;

    invoke-virtual {v0}, Lcom/tencent/mm/protocal/b/aeu;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public final tZ()I
    .locals 1

    .prologue
    .line 19
    const/16 v0, 0x8b

    return v0
.end method
