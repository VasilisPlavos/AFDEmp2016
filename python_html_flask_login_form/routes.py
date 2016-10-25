from flask import Flask, url_for, flash, send_from_directory, request, redirect, session, render_template
from forms import ContactForm
import os

app = Flask(__name__)
app.secret_key = 'random string'

@app.route('/')
def hello_world():
    return 'Hello, World!'

if __name__ == '__main__':
   app.run(debug = True)


@app.route('/hello/')
@app.route('/hello/<name>')
def hello_name(name):
   return 'Hello %s!' % name


@app.route('/post/<int:post_id>')
def show_post(post_id):
    # show the post with the given id, the id is an integer
    return 'Post %d' % post_id


@app.route('/projects/')
def projects():
    return 'The project page'

@app.route('/about')
def about():
    return 'The about page'


@app.route('/vasilis')
def vasilis():
    return render_template('vasilis.html')

@app.route('/new', methods = ['GET', 'POST'])
def new():
    if (request.method == 'POST'):
        if (not request.form['name'] or not request.form['surname'] \
                or not request.form['email'] or not request.form['password']):
            flash('Please fill all the fields.', 'error')
        else:
            session['name'] = request.form['name']
            return login()
    return render_template('new.html')

@app.route('/login', methods=['POST'])
def login():
    if 'name' in session:
        name = session['name']
        return 'Hello %s!' % name
    return "You are not logged in <br><a href = '/login'></b>" + \
      "click here to log in</b></a>"

@app.route('/logout')
def logout():
   # remove the name from the session if it is there
   session.pop('name', None)
   return redirect(url_for('index'))


@app.route('/')
def index():
   return render_template('index.html') # returns a simple .html page


if __name__ == '__main__':
    app.run(debug = True)
