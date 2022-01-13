//--- 作業用の変数を確保
let saveId;
let popup;

//--- 実行に先立って、ポップアップの要素を確保する
window.onload = function () {
    popup = document.getElementById("popup-id");
}

//--- ＋をクリックしたときの処理
function showDialog(e) {
    saveId = (e.target.id).substring(0, 3);  //--- idの先頭３文字を保存
    popupOpen();           //--- ポップアップを開く
}

//--- ポップアップから画像を選んだ時の処理
function returnData(url) {
    // 情報をとりあえず保存
    document.getElementById(saveId + "s").value = url;
    // ＋の要素を取り出して子要素を削除する
    const obj = document.getElementById(saveId + "g");
    while(obj.firstChild) {
        obj.removeChild(obj.firstChild);
    }
    // img 要素を作る
    const img = document.createElement("img");
    img.setAttribute("src", url);
    img.setAttribute("class", "imgSize");
    // ＋の要素の子要素として登録
    obj.appendChild(img);

    // ポップアップを閉じる
    popupClose();
}

//--- ポップアップを開く処理
function popupOpen() {
    popup.style.display = "block";
}

//--- ポップアップを閉じる処理
function popupClose() {
    popup.style.display = "none";
}
