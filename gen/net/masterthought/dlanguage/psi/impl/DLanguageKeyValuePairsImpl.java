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

public class DLanguageKeyValuePairsImpl extends ASTWrapperPsiElement implements DLanguageKeyValuePairs {

  public DLanguageKeyValuePairsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitKeyValuePairs(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLanguageKeyValuePair getKeyValuePair() {
    return findNotNullChildByClass(DLanguageKeyValuePair.class);
  }

  @Override
  @Nullable
  public DLanguageKeyValuePairs getKeyValuePairs() {
    return findChildByClass(DLanguageKeyValuePairs.class);
  }

  @Override
  @Nullable
  public PsiElement getOpComma() {
    return findChildByType(OP_COMMA);
  }

}
