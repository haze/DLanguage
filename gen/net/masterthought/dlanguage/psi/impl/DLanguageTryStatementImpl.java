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

public class DLanguageTryStatementImpl extends ASTWrapperPsiElement implements DLanguageTryStatement {

  public DLanguageTryStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitTryStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageCatches getCatches() {
    return findChildByClass(DLanguageCatches.class);
  }

  @Override
  @Nullable
  public DLanguageFinallyStatement getFinallyStatement() {
    return findChildByClass(DLanguageFinallyStatement.class);
  }

  @Override
  @NotNull
  public DLanguageScopeStatement getScopeStatement() {
    return findNotNullChildByClass(DLanguageScopeStatement.class);
  }

  @Override
  @NotNull
  public PsiElement getKwTry() {
    return findNotNullChildByType(KW_TRY);
  }

}
