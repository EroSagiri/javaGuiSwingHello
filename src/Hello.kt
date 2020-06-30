import java.awt.FlowLayout
import java.awt.Font
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil

class Hello : JFrame {
    companion object {
        val defaultFont = Font("微软雅黑", Font.BOLD, 30)
        val buttonFont = Font("微软雅黑", Font.PLAIN, 30)
        val button1 = JButton("+1")
        val button2 = JButton("+3")
        val button3 = JButton("0")
        val indexLabel = JLabel("0")
    }
    var index = 0;

    constructor() : super() {
        init()
    }

    constructor(windowName: String) {
        init(windowName)
    }

    fun init(windowName : String = "hello") {
        add(button1)
        add(button2)
        add(button3)
        add(indexLabel)

        setSize(600, 600)
        title = windowName
        setVisible(true)
        layout = null

        button1.setBounds(20, 20, 100, 100)
        button2.setBounds(20, 130, 100, 100)
        button3.setBounds(20, 240, 100, 100)
        indexLabel.setBounds(130, 130, 100, 100)
        indexLabel.font = defaultFont
        button1.font = buttonFont
        button2.font = buttonFont
        button3.font = buttonFont

        button1.addActionListener {
            index ++
            indexLabel.text = index.toString()
        }

        button2.addActionListener {
            index += 3
            indexLabel.text = index.toString()
        }

        button3.addActionListener {
            index = 0;
            indexLabel.text = index.toString()
        }
    }
}

fun main() {
    //Hello()
    Hello()
}