// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageShiftExpressionImpl extends ASTWrapperPsiElement implements DLanguageShiftExpression {

  public DLanguageShiftExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitShiftExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLanguageAddExpression getAddExpression() {
    return findNotNullChildByClass(DLanguageAddExpression.class);
  }

  @Override
  @Nullable
  public DLanguageShiftExpression getShiftExpression() {
    return findChildByClass(DLanguageShiftExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getOpShLeft() {
    return findChildByType(OP_SH_LEFT);
  }

  @Override
  @Nullable
  public PsiElement getOpShRight() {
    return findChildByType(OP_SH_RIGHT);
  }

  @Override
  @Nullable
  public PsiElement getOpUshRight() {
    return findChildByType(OP_USH_RIGHT);
  }

}
