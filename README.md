# Restart ESLint Action Plugin

An IDEA plugin that lets you restart ESLint via an action. This is very useful
for when developing ESLint features, such as custom rules.

In IDEA IDEs such as WebStorm & IntelliJ, when you make a change to an
ESLint-related file (aside from the configuration files), such as a rule in
`node_modules`, you have to disable & re-enable ESLint via the settings panel
for the change to take effect.

This plugin adds an action called "Restart ESLint Service" that does exactly
what it says: restarts the ESLint service and triggers a new linting run,
making it much easier & quicker to test your changes.
