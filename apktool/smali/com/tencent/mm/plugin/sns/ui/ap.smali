.class public final Lcom/tencent/mm/plugin/sns/ui/ap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/plugin/sns/ui/ap$a;
    }
.end annotation


# instance fields
.field private hI:Landroid/view/LayoutInflater;

.field hld:Lcom/tencent/mm/ui/base/k;

.field hle:Lcom/tencent/mm/ui/base/n$c;

.field hlf:Lcom/tencent/mm/ui/base/n$d;

.field hlg:Lcom/tencent/mm/ui/base/l;

.field hlh:Lcom/tencent/mm/plugin/sns/ui/ap$a;

.field hli:Ljava/util/HashMap;

.field hlj:Ljava/util/HashMap;

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hli:Ljava/util/HashMap;

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hlj:Ljava/util/HashMap;

    .line 41
    iput-object p1, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->mContext:Landroid/content/Context;

    .line 42
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hI:Landroid/view/LayoutInflater;

    .line 43
    new-instance v0, Lcom/tencent/mm/ui/base/k;

    invoke-direct {v0, p1}, Lcom/tencent/mm/ui/base/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hld:Lcom/tencent/mm/ui/base/k;

    .line 44
    new-instance v0, Lcom/tencent/mm/ui/base/l;

    invoke-direct {v0}, Lcom/tencent/mm/ui/base/l;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hlg:Lcom/tencent/mm/ui/base/l;

    .line 45
    return-void
.end method

.method static synthetic a(Lcom/tencent/mm/plugin/sns/ui/ap;)Lcom/tencent/mm/ui/base/l;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hlg:Lcom/tencent/mm/ui/base/l;

    return-object v0
.end method

.method static synthetic b(Lcom/tencent/mm/plugin/sns/ui/ap;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hI:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method static synthetic c(Lcom/tencent/mm/plugin/sns/ui/ap;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hli:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic d(Lcom/tencent/mm/plugin/sns/ui/ap;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hlj:Ljava/util/HashMap;

    return-object v0
.end method

.method private dismiss()V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hld:Lcom/tencent/mm/ui/base/k;

    invoke-virtual {v0}, Lcom/tencent/mm/ui/base/k;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hld:Lcom/tencent/mm/ui/base/k;

    invoke-virtual {v0}, Lcom/tencent/mm/ui/base/k;->dismiss()V

    .line 87
    :cond_0
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 71
    iget-object v0, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hlg:Lcom/tencent/mm/ui/base/l;

    iget-object v0, v0, Lcom/tencent/mm/ui/base/l;->kFt:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/mm/ui/base/m;

    .line 72
    invoke-virtual {v0}, Lcom/tencent/mm/ui/base/m;->performClick()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 73
    const-string/jumbo v0, "!44@/B4Tb64lLpIApwzsVfw/GcdUoIVhW7WYRiNJy+gcMRw="

    const-string/jumbo v1, "onItemClick menu item has listener"

    invoke-static {v0, v1}, Lcom/tencent/mm/sdk/platformtools/u;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-direct {p0}, Lcom/tencent/mm/plugin/sns/ui/ap;->dismiss()V

    .line 81
    :goto_0
    return-void

    .line 77
    :cond_0
    iget-object v1, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hlf:Lcom/tencent/mm/ui/base/n$d;

    if-eqz v1, :cond_1

    .line 78
    iget-object v1, p0, Lcom/tencent/mm/plugin/sns/ui/ap;->hlf:Lcom/tencent/mm/ui/base/n$d;

    invoke-interface {v1, v0, p3}, Lcom/tencent/mm/ui/base/n$d;->d(Landroid/view/MenuItem;I)V

    .line 80
    :cond_1
    invoke-direct {p0}, Lcom/tencent/mm/plugin/sns/ui/ap;->dismiss()V

    goto :goto_0
.end method
