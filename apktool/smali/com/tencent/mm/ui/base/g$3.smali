.class final Lcom/tencent/mm/ui/base/g$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/ui/base/n$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/mm/ui/base/g;->b(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLcom/tencent/mm/ui/base/g$d;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic kCA:Lcom/tencent/mm/ui/base/g$d;


# direct methods
.method constructor <init>(Lcom/tencent/mm/ui/base/g$d;)V
    .locals 0

    .prologue
    .line 944
    iput-object p1, p0, Lcom/tencent/mm/ui/base/g$3;->kCA:Lcom/tencent/mm/ui/base/g$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/MenuItem;I)V
    .locals 2

    .prologue
    .line 948
    iget-object v0, p0, Lcom/tencent/mm/ui/base/g$3;->kCA:Lcom/tencent/mm/ui/base/g$d;

    if-eqz v0, :cond_0

    .line 949
    iget-object v0, p0, Lcom/tencent/mm/ui/base/g$3;->kCA:Lcom/tencent/mm/ui/base/g$d;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    invoke-interface {v0, p2, v1}, Lcom/tencent/mm/ui/base/g$d;->aq(II)V

    .line 951
    :cond_0
    return-void
.end method
