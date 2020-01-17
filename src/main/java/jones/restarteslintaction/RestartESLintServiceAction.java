package jones.restarteslintaction;

import com.intellij.codeInsight.daemon.DaemonCodeAnalyzer;
import com.intellij.lang.javascript.linter.eslint.service.EslintLanguageServiceManager;
import com.intellij.lang.javascript.linter.eslint.standardjs.StandardJSLanguageServiceManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;

public class RestartESLintServiceAction extends AnAction {
  @Override
  public void actionPerformed(AnActionEvent event) {
    Project project = event.getProject();

    if(project == null || project.isDisposed()) {
      return;
    }

    EslintLanguageServiceManager.getInstance(project).terminateServices();
    StandardJSLanguageServiceManager.getInstance(project).terminateServices();

    DaemonCodeAnalyzer.getInstance(project).restart();
  }
}
