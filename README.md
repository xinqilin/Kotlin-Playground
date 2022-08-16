# Kotlin-Playground
reference:  <a href="https://ithelp.ithome.com.tw/articles/10261496">2021 鐵人賽 modernweb Coroutine 停看聽系列 第 3 篇</a>

```kotlin
suspend fun showContents() = coroutineScope {
    launch {
        val token = login(userName, password)
        val content = fetch(token)
        withContext(Dispatchers.Main) {
            showContents(content)
        }
    }
}

```

###　在非同步的函式中加上了 suspend
  Kotlin 的 Coroutine 用 suspend 這個關鍵字來宣告該函式為可暫停的函式。
### 使用 coroutineScope 將程式碼包起來。
  suspend function ，這些可暫停的函式只能在 Coroutine 中使用，而 coroutineScope 是用來建立一個新的範圍 (Scope)，在 {} 內部的程式碼，就是稱為在 Coroutine 裏面的程式。
### method 在 launch{} 中執行。
  launch{} 的功能類似 coroutineScope ，它也是用來定義一個 Coroutine 的範圍，不過與 coroutineScope 不同的是，它會新建 coroutine ，而且它有一個回傳值 Job 。
### withContext(Dispatchers.Main) 將 showContents(content) 包起來。
  可以把 coroutine 想成是執行緒(thread)的概念，利用背景的執行緒來執行耗時動作，完成之後，在由主執行緒來繪製畫面。
  前方的 launch{} 可以看作是建立一個新的執行緒，到了 withContext(Dispatchers.Main) 把 context 切回 Dispatchers.Main 也就是主執行緒，在主執行緒上進行畫面的更新

### 複習

```kotlin
    val c = s.toCharArray()
    val arr = IntArray(26)
    for (i in 0 until c.size - 1) {
      if (map[c[i]]!! >= map[c[i + 1]]!!) {
        ans += map[c[i]]!!
      } else {
        ans -= map[c[i]]!!
      }
    }

    val map = HashMap<Char, Int>()
    map['I'] = 1
    map['V'] = 5
    map['X'] = 10
    map['L'] = 50
    map['C'] = 100
    map['D'] = 500
    map['M'] = 1000
```