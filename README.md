<h1>Java Reflection with Annotations Example</h1>

<p>This Java application demonstrates the use of reflection to manipulate fields annotated with custom annotations. The example shows how to inject random values into an object's fields based on the parameters defined in a custom annotation.</p>

<h2>Classes Overview</h2>

<h3>Main</h3>
<p>
    The <code>Main</code> class serves as the entry point for the application. It creates a <code>Student</code> object, uses the <code>RandomNumberInjector</code> to inject random values into annotated fields, and then prints the student's details to the console.
</p>

<h3>RandomNumber</h3>
<p>
    The <code>RandomNumber</code> annotation defines two parameters: <code>min</code> and <code>max</code>, which specify the range for the random number generation. Fields annotated with <code>@RandomNumber</code> will be assigned a random value within this range.
</p>

<h3>RandomNumberInjector</h3>
<p>
    The <code>RandomNumberInjector</code> class contains the logic for injecting random numbers into fields annotated with <code>RandomNumber</code>. It uses reflection to:
</p>
<ul>
    <li>Scan the object's fields for the <code>@RandomNumber</code> annotation.</li>
    <li>Generate a random value within the specified range.</li>
    <li>Set the generated value to the corresponding field.</li>
</ul>

<h3>Student</h3>
<p>
    The <code>Student</code> class represents a student with the following fields:
</p>
<ul>
    <li><code>name</code>: The student's name.</li>
    <li><code>grade</code>: The student's grade level.</li>
    <li><code>score</code>: The student's score, which is annotated with <code>@RandomNumber</code>. A random value is injected into this field.</li>
    <li><code>age</code>: The student's age.</li>
</ul>

<h2>How It Works</h2>
<p>
    The application creates a <code>Student</code> object and passes it to the <code>RandomNumberInjector</code>. The injector scans the object's fields and assigns a random value to any field annotated with <code>@RandomNumber</code>. This demonstrates how annotations can be used to drive custom behavior in a program.
</p>

<h2>Usage</h2>
<pre><code>java Main.java</code></pre>
<p>Run the application to see the injected random values for the annotated fields.</p>
