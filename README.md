# PoopPlayerAlertPlugin

## PPAP
略してPPAP

## 概要
うんちみたいなプレイヤー、またはうんちそうなプレイヤーのログインイベントを監視する。

## 仕様
- コマンドでユーザ名を指定してconfig.ymlに対象ユーザのUUIDを追加。
- 記録されているUUIDをログインイベントで拾ったユーザのUUIDと照らし合わせてアラートをDiscordへ投げる。
- BATと連携してログインイベントで拾ったユーザに前科ログがあった場合アラートを出す。
- コマンドで能動的に監視ユーザを追加したときはMySQLにUUID突っ込む（コマンドでリストを出せるようにする）
- 特定の権限が付与されているユーザは各通知を非通知にする。
- Discordへの通知は特定チャンネルへ、メンションはなし

- (実装検討中?)コマンドの実行ログからうんちそうなものをアラート通知する。
- 上記を永続通知対象として自動で追加するかどうか→通知のみ

## コマンド
実装後に記載。
- `/ppap user add <player>` 監視追加
- `/ppap user delete <player>` 非監視化
- `/ppap user lookup <player>` プレイヤー情報の参照
- `/ppap cmd add <word>` 監視コマンド追加
- `/ppap cmd delete <word>` 監視コマンド削除
- `/ppap user list <n>` リスト
- `/ppap cmd list <n>` リスト

## Permissions
- `ppap.notify.except`
- `ppap.command.user.add`
- `ppap.command.user.delete`
- `ppap.command.user.lookup`
- `ppap.command.user.list`
- `ppap.command.cmd.add`
- `ppap.command.cmd.delete`
- `ppap.command.cmd.list`
