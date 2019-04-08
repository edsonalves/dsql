<img align="right" src="logo/logo264.png" alt="FeatureIDE">

### An extensible framework for feature-oriented software development

<p>You like FeatureIDE or you are interested in updates? Star or watch us on <a href="https://github.com/FeatureIDE/FeatureIDE">GitHub</a>. Follow us on <a href="https://twitter.com/FeatureIDE">Twitter</a>. Subscribe to our <a href="https://www.youtube.com/channel/UC0xYesZDzhFUbq6GUKtr3uA">YouTube</a> channel. Follow new publications at <a href="https://scholar.google.de/citations?user=I7Kw3l8AAAAJ">Google Scholar</a>. Mark us as favorite in the <a href="http://marketplace.eclipse.org/content/featureide">Eclipse Marketplace</a>.</p>

Quick links to <a href="http://featureide.cs.ovgu.de/update/v3/">Update Site</a>, <a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/nightly/p2-updateSite/">Nightly Update Site</a>, <a href="https://github.com/tthuem/FeatureIDE">GitHub</a>, <a href="http://featureide.cs.ovgu.de/update/v3/changelog.txt">Change log</a>

Jump below to <!--<a href="#screenshots">Screenshots</a>,--> <a href="#publications">Publications</a>, <a href="#documentation">Documentation</a>, <a href="#download">Download</a>, <a href="#faq">FAQ</a>, <a href="#contact">Contact</a>, <a href="#statistics">Statistics</a>, <a href="#relateddownloads">Related Downloads</a>

<p>Software product lines (SPL) have a long tradition and will gain momentum in the future. Today's research tries to
move software development to a new quality of industrial production. Several solutions concerning different phases
of the software development process have been proposed in order to cope with different problems of product-line development.
A major problem of product-line engineering is still the missing tool support. The vision is an integrated development environment (IDE) that brings all phases of the development process together, consistently and in a user-friendly manner.</p>

<p><em>FeatureIDE</em> is an Eclipse-based IDE that supports all phases of feature-oriented software development for the development of SPLs: domain analysis, domain design, domain implementation, requirements analysis, software generation, and quality assurance. Different SPL implementation techniques are integrated such as feature-oriented programming (FOP), aspect-oriented programming (AOP), preprocessors, and plug-ins.
</p>

<div style="float:right;margin-left:10px;margin-below:10px;width:450px;"><a class="twitter-timeline"  href="https://twitter.com/FeatureIDE" data-widget-id="663660887211929600">Tweets by @FeatureIDE </a>
<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script></div>

<p>FeatureIDE is&nbsp;under constant development. The following features have been implemented since 2004:</p>

* Domain analysis
  * Graphical and textual editor for feature models and cross-tree constraints
  * Automated analysis and explanation of feature-model anomalies, such as dead and false-optional features, based on <a href="http://www.sat4j.org/">Sat4j</a>
  * Categorization of feature-model edits into refactoring, generalization, specialization, and arbitrary edits
  * Folding and layouting that scale to large feature models with thousands of features
  * Import and export of feature models to tools and languages, such as <a href="http://people.sc.fsu.edu/~jburkardt/data/cnf/cnf.html">Dimacs</a>, <a href="http://sourceforge.net/projects/fmp/">fmp: Feature Modeling Plug-in</a>, <a href="http://www.cs.utexas.edu/~schwartz/ATS/fopdocs/guidsl.html">GUIDSL</a>, <a href="http://www.splot-research.org/">S.P.L.O.T.</a>, <a href="http://fosd.de/SPLConqueror">SPL Conqueror</a>, <a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/research/MultiPLe/modeling.php">Velvet</a>
* Domain design
  * Collaboration diagram and outline to visualize and navigate in product-line architectures
  * Sophisticated filtering and folding opportunities
* Domain implementation
  * Feature-oriented programming with <a href="http://www.cs.utexas.edu/users/schwartz/ATS.html">AHEAD</a> (Java 1.4), <a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/forschung/fop/featurec/">FeatureC++</a> (C++), and <a href="http://www.fosd.de/fh">FeatureHouse</a> (C, Java 1.5, JML, Haskell, XML, JavaCC)
  * Aspect-oriented programming with <a href="http://www.eclipse.org/aspectj/">AspectJ</a> (Java) and <a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/forschung/fop/featurec/">FeatureC++</a> (C++)
  * Delta-oriented modeling and programming with <a href="http://deltaecore.org/">DeltaEcore</a> and <a href="http://deltaj.sourceforge.net/">DeltaJ</a> (Java)
  * Annotation-based implemenation with preprocessor <a href="http://antenna.sourceforge.net/">Antenna</a>, C preprocessor CPP by <a href="https://sites.google.com/a/ic.ufal.br/colligens/">Colligens</a>, and preprocessor <a href="http://sonatype.github.com/munge-maven-plugin/">Munge</a>
  * Black-box frameworks with plug-ins
  * Runtime variability with runtime parameters and property files
  * Statistics and code metrics for product-line implementations
  * Refactoring, source-code documentation with <a href="http://www.java-doc.de/">JavaDoc</a>, and formal specification with <a href="http://www.eecs.ucf.edu/~leavens/JML//index.shtml">JML</a>
* Requirements analysis
  * Editor for configuration processes without backtracking
  * Validity checking and decision propagation based on <a href="http://www.sat4j.org/">Sat4j</a>
  * Checking for unused and always selected features
  * Comparison of user-defined configuration
  * Recommendation of features
* Software generation and quality assurance
  * Automated product generation after changes for one selected configuration
  * Propagation of compiler markers to original source code
  * Family-based analyses
    * Detection of dead code blocks and superficial ifdefs in annotation-based product lines based on <a href="http://www.sat4j.org/">Sat4j</a>
    * Family-based type checks for FeatureHouse projects with <a href="http://fosd.de/fuji">Fuji</a>
    * Family-based parsing and type checks for CPP projects with <a href="http://ckaestne.github.io/TypeChef/">TypeChef</a>
  * Semi-automated generation of configurations, compilation and testing (i.e., product-based analysis)
    * Generation of all valid configurations
    * Generation of all current configurations (defined in requirements analysis)
    * T-wise sampling with <a href="https://www.isf.cs.tu-bs.de/cms/team/thuem/papers/2016-GPCE-AlHajjaji.pdf">IncLing</a>, <a href="http://heim.ifi.uio.no/martifag/splcatool/">SPLCATool</a>, <a href="http://cse.unl.edu/~citportal/citportal/loadTool?page=casa&id=1">CASA</a>
    * Generation of random configurations
    * Prioritization of configurations (e.g., by similarity)
    * Unit testing with <a href="http://junit.org/junit4/">JUnit</a>
* Cross-cutting features
  * Feature traceability with colors over the whole development cycle
  * Cheat sheet, wiki, slides, and screencasts available for documentation
  * Many examples for feature models and product lines

<p>Numerous other tools have been built on top of the FeatureIDE architecture:</p>

* <a href="https://but4reuse.github.io/">BUT4Reuse</a>: Feature identification in clone-and-own, feature-model import from and export to FeatureIDE
* <a href="http://fosd.net/cide">CIDE</a>: A software product line tool for software product line development following the paradigm of separation of concerns
* <a href="https://sites.google.com/a/ic.ufal.br/colligens/">Colligens</a>: A FeatureIDE extension providing tool support for C code annotated with the C preprocessor
* <a href="http://familiar-project.github.io/">FAMILIAR</a>: An executable language that supports manipulating and reasoning about feature models
* <a href="https://github.com/nils-christian/feature-gen">feature-gen</a>: Takes a FeatureIDE feature model as input and generates Java classes with annotated features
* <a href="http://fosd.de/fuji">Fuji</a>: An extensible compiler that supports feature-oriented programming in Java
* <a href="http://www.integrate.ovgu.de/Das+Projekt.html">INTEGRATE</a>: supporting company-wide, collaborative and variability-aware industrial plant engineering
* <a href="http://combinators.org/launchpad/update-site/">Launchpad</a>: Feature-oriented synthesis of programs
* <a href="https://github.com/ckaestne/LEADT">LEADT</a>: Supports developers in locating features in Java code in order to turn them into a software product line
* <a href="https://www.tu-braunschweig.de/isf/research/vampire/index.html">VAmPiRE</a>: Variant-Preserving Refactoring for Feature-Oriented Software Product Lines
* <a href="https://github.com/tthuem/VariantSync">VariantSync</a>: Synchronization support for clone-and-own based on domain knownledge specified with FeatureIDE
* Is your tool missing? Please <a href="mailto:jens.meinicke@ovgu.de,t.thuem@tu-braunschweig.de">let us know</a>.

<h2><a name="publications"></a>Publications</h2>

<p>In the following, we only report selected publications with the main aim to demonstrate or describe FeatureIDE's functionality. For a more complete list of publications on the FeatureIDE functionality, we refer to <a href="https://scholar.google.de/citations?user=I7Kw3l8AAAAJ">Google Scholar</a>.</p>

<ul class="bib2xhtml">

<li><a name="Meinicke17"></a>Jens Meinicke, Thomas Th&uuml;m, Reimar Schr&ouml;ter, Fabian Benduhn, Thomas Leich, and Gunter Saake.
<a href="https://www.springer.com/book/9783319614427">Mastering Software Variability with FeatureIDE</a>.
Springer, 2017. To appear.<br />&nbsp;</li>

<li><a name="AlhajjajiMK+:GPCE16"></a>Mustafa Al-Hajjaji, Jens Meinicke,
  Sebastian Krieter, Reimar Schr&ouml;ter, Thomas Th&uuml;m, Thomas Leich, and
  Gunter Saake.
<a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/auto/AlhajjajiMK+:GPCE16.pdf">Tool Demo: Testing Configurable Systems with FeatureIDE</a>.
In <cite>Proceedings of the International Conference on Generative Programming:
  Concepts &amp; Experiences (GPCE)</cite>, pages 173–177, New York, NY, USA,
  October 2016. <a href="https://dl.acm.org/citation.cfm?id=2993254">ACM</a>.<br>&nbsp;</li>
 
<li><a name="MeinickeTS+16"></a>Jens Meinicke, Thomas Th&uuml;m, Reimar
Schr&ouml;ter, Sebastian Krieter, Fabian Benduhn, Gunter Saake, and Thomas
Leich.
<a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/auto/MeinickeTS+16.pdf">FeatureIDE: Taming the Preprocessor Wilderness</a>.
In Proceedings of the International Conference on Software Engineering (ICSE), pages 629-632, New York, NY, USA. May 2016. <a href="https://dl.acm.org/citation.cfm?id=2889175">ACM</a>.<br />&nbsp;</li>

<li><a name="PereiraKM+16"></a>Juliana&nbsp;Alves Pereira, Sebastian
Krieter, Jens Meinicke, Reimar Schr&ouml;ter, Gunter Saake, and Thomas Leich.
<a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/auto/PereiraKM+16.pdf">FeatureIDE: Scalable Product Configuration of Variable Systems</a>.
In Proceedings of the International Conference on Software Reuse (ICSR), pages 397-401, New York, NY, USA. <a href="https://link.springer.com/chapter/10.1007/978-3-319-35122-3_27">Springer</a>. (Link to <a href="https://dl.acm.org/citation.cfm?id=2986202">ACM</a>)<br />&nbsp;</li>

<li><a name="ThKaBe+:SCP12"></a>Thomas Th&uuml;m, Christian K&auml;stner,
Fabian Benduhn, Jens Meinicke, Gunter Saake, and Thomas Leich.
<a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/auto/ThKaBe+:SCP12.pdf">FeatureIDE: An Extensible Framework for Feature-Oriented Software Development</a>.
<cite>Science of Computer Programming</cite>, 79(0):70&ndash;85, January
2014. (Link to <a href="https://dl.acm.org/citation.cfm?id=2537315">ACM</a>)<br />&nbsp;</li>

<li><a name="KTSFLWA:ICSE09"></a>Christian K&auml;stner, Thomas Th&uuml;m,
Gunter Saake, Janet Feigenspan, Thomas Leich, Fabian Wielgorz, and Sven Apel.
<a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/09/icse2009_featureide_demo.pdf">FeatureIDE: Tool Framework for Feature-Oriented Software
Development</a>.
In <cite>Proceedings of the International Conference on Software
Engineering (ICSE)</cite>, pages 611&ndash;614. IEEE Computer Society, May 2009. (Link to <a href="https://dl.acm.org/citation.cfm?id=1555087">ACM</a>)<br />&nbsp;</li>

<li><a name="LeiApeMar05oopsla"></a>T.&nbsp;Leich, S.&nbsp;Apel, L.&nbsp;Marnitz, and
G.&nbsp;Saake.
<a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/auto/LeiApeMar05oopsla.pdf">Tool Support for Feature-Oriented Software Development -
FeatureIDE: An Eclipse-Based Approach -</a>.
In <cite>Proceedings of OOPSLA Eclipse Technology eXchange (ETX)
Workshop</cite>, pages 55&ndash;59, San Diego, USA, October
2005. (Link to <a href="https://dl.acm.org/citation.cfm?id=1117708">ACM</a>)<br />&nbsp;</li>

</ul>




<h2><a name="documentation"></a>Documentation</h2>

<p>For a current step-by-step <strong>tutorial</strong> see the FeatureIDE cheat
sheet in Eclipse (help menu).</p>

<p><strong>Examples</strong> can be found using <i>New &gt; Examples &gt;
FeatureIDE</i>.</p>

<p>We prepared slides as documentation for FeatureIDE:

<ol>
<li><a href="slides/featureide-0-background.pdf">FeatureIDE: Background</a> - Short overview of Feature-Oriented Software Development</li>
<li><a href="slides/featureide-1-overview.pdf">FeatureIDE: Overview</a> - Description of FeatureIDE's Functionality</li>
<li><a href="slides/featureide-2-getstarted.pdf">FeatureIDE: Get Started</a> - How to install FeatureIDE and retrieve example projects</li>
<li><a href="slides/featureide-3-development.pdf">FeatureIDE: Development</a> - How to extend FeatureIDE, i.e., how is the SVN organized and which plug-in implements which functionalities</li>
</ol>
</p>

<p>Please check out the <a href="http://www.infosun.fim.uni-passau.de/cl/staff/liebig/sple/"> tutorial</a> by J&ouml;rg Liebig based on material by Don Batory
including videos explaining the usage.</p>

<h2><a name="installation"></a><a name="download"></a>Download</h2>

<div style="float:right;"><a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=22848" class="drag" title="Drag to your running Eclipse workspace to install FeatureIDE"><img class="img-responsive" src="http://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.png" alt="Drag to your running Eclipse workspace to install FeatureIDE" /></a></div>

<h3>Marketplace</h3>

<p>You can download FeatureIDE in the Eclipse Marketplace by dragging the install button (on the right side) into your Eclipse or using <i>Help &gt; Eclipse Marketplace</i> and then searching for <i>FeatureIDE</i>.</p>

<h3>Prepackaged Versions</h3>

<p>As there are many dependencies and installation is not always straightforward, we prepared special versions of Eclipse with all necessary plug-ins installed. In most cases, we took an existing Eclipse with JDT and then installed CDT, AJDT, and FeatureIDE. For a 32bit version, Java 32bit is required (even possible on a 64bit machine). For a 64bit version, Java 64bit is required (only possible on a 64bit machine).</p>

| FeatureIDE | Eclipse | Eclipse with FeatureIDE, JDT, CDT, and AJDT | Eclipse with Feature Modeling | FeatureIDE Library |
| --- | --- | --- | --- | --- |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.5.4">v3.5.4</a> | 4.9.0 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.4/eclipse4.9.0committers-featureide3.5.4-win64.zip">Windows 64bit</a> (559MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.4/eclipse4.9.0committers-featureide3.5.4-macosx64.zip">MacOS 64bit</a> (558MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.4/eclipse4.9.0committers-featureide3.5.4-linux64.zip">Linux 64bit</a> (556MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.4/eclipse4.9.0platform-featureide3.5.4fm-win64.zip">Windows 64bit</a> (149MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.4/eclipse4.9.0platform-featureide3.5.4fm-macosx64.zip">MacOS 64bit</a> (149MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.4/eclipse4.9.0platform-featureide3.5.4fm-linux64.zip">Linux 64bit</a> (149MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.4/de.ovgu.featureide.lib.fm-v3.5.4.jar">FeatureIDE jar</a> (2MB),  <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.4/de.ovgu.featureide.lib.fm.attributes-v3.5.4.jar">Attributes jar</a> (1MB), and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/07c2a884c11a0c68eb6c283434bb24a318b1e191/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.5.3">v3.5.3</a> | 4.7.3 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.3/eclipse4.7.3committers-featureide3.5.3-win64.zip">Windows 64bit</a> (556MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.3/eclipse4.7.3committers-featureide3.5.3-macosx64.zip">MacOS 64bit</a> (555MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.3/eclipse4.7.3committers-featureide3.5.3-linux64.zip">Linux 64bit</a> (554MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.3/eclipse4.7.3platform-featureide3.5.3fm-win64.zip">Windows 64bit</a> (151MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.3/eclipse4.7.3platform-featureide3.5.3fm-macosx64.zip">MacOS 64bit</a> (151MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.3/eclipse4.7.3platform-featureide3.5.3fm-linux64.zip">Linux 64bit</a> (151MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.3/de.ovgu.featureide.lib.fm-v3.5.3.jar">FeatureIDE jar</a> (2MB),  <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.3/de.ovgu.featureide.lib.fm.attributes-v3.5.3.jar">Attributes jar</a> (1MB), and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/07c2a884c11a0c68eb6c283434bb24a318b1e191/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.5.2">v3.5.2</a> | 4.7.3 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.2/eclipse4.7.3committers-featureide3.5.2-win64.zip">Windows 64bit</a> (561MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.2/eclipse4.7.3committers-featureide3.5.2-macosx64.zip">MacOS 64bit</a> (555MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.2/eclipse4.7.3committers-featureide3.5.2-linux64.zip">Linux 64bit</a> (555MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.2/eclipse4.7.3platform-featureide3.5.2fm-win64.zip">Windows 64bit</a> (150MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.2/eclipse4.7.3platform-featureide3.5.2fm-macosx64.zip">MacOS 64bit</a> (151MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.2/eclipse4.7.3platform-featureide3.5.2fm-linux64.zip">Linux 64bit</a> (150MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.2/de.ovgu.featureide.lib.fm-v3.5.2.jar">FeatureIDE jar</a> (2MB),  <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.2/de.ovgu.featureide.lib.fm.attributes-v3.5.2.jar">Attributes jar</a> (1MB), and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/07c2a884c11a0c68eb6c283434bb24a318b1e191/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.5.1">v3.5.1</a> | 4.7.3 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.1/eclipse4.7.3committers-featureide3.5.1-win64.zip">Windows 64bit</a> (557MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.1/eclipse4.7.3committers-featureide3.5.1-macosx64.zip">MacOS 64bit</a> (557MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.1/eclipse4.7.3committers-featureide3.5.1-linux64.zip">Linux 64bit</a> (556MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.1/eclipse4.7.3platform-featureide3.5.1fm-win64.zip">Windows 64bit</a> (151MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.1/eclipse4.7.3platform-featureide3.5.1fm-macosx64.zip">MacOS 64bit</a> (152MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.1/eclipse4.7.3platform-featureide3.5.1fm-linux64.zip">Linux 64bit</a> (151MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.1/de.ovgu.featureide.lib.fm-v3.5.1.jar">FeatureIDE jar</a> (2MB),  <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.1/de.ovgu.featureide.lib.fm.attributes-v3.5.1.jar">Attributes jar</a> (1MB), and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/07c2a884c11a0c68eb6c283434bb24a318b1e191/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.5.0">v3.5.0</a> | 4.7.3 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.0/eclipse4.7.3committers-featureide3.5.0-win64.zip">Windows 64bit</a> (554MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.0/eclipse4.7.3committers-featureide3.5.0-macosx64.zip">MacOS 64bit</a> (554MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.0/eclipse4.7.3committers-featureide3.5.0-linux64.tar.gz">Linux 64bit</a> (552MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.0/eclipse4.7.3platform-featureide3.5.0fm-win64.zip">Windows 64bit</a> (150MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.0/eclipse4.7.3platform-featureide3.5.0fm-macosx64.zip">MacOS 64bit</a> (150MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.0/eclipse4.7.3platform-featureide3.5.0fm-linux64.tar.gz">Linux 64bit</a> (150MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.0/de.ovgu.featureide.lib.fm-v3.5.0.jar">FeatureIDE jar</a> (2MB),  <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.5.0/de.ovgu.featureide.lib.fm.attributes-v3.5.0.jar">Attributes jar</a> (1MB), and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/07c2a884c11a0c68eb6c283434bb24a318b1e191/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.4.3">v3.4.3</a> | 4.7.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.3/eclipse4.7.2committers-featureide3.4.3-win64.zip">Windows 64bit</a> (548MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.3/eclipse4.7.2committers-featureide3.4.3-macosx64.zip">MacOS 64bit</a> (564MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.3/eclipse4.7.2committers-featureide3.4.3-linux64.tar.gz">Linux 64bit</a> (545MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.3/eclipse4.7.2platform-featureide3.4.3fm-win64.zip">Windows 64bit</a> (149MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.3/eclipse4.7.2platform-featureide3.4.3fm-macosx64.zip">MacOS 64bit</a> (150MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.3/eclipse4.7.2platform-featureide3.4.3fm-linux64.tar.gz">Linux 64bit</a> (149MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.3/de.ovgu.featureide.lib.fm-v3.4.3.jar">FeatureIDE jar</a> (2MB) and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/07c2a884c11a0c68eb6c283434bb24a318b1e191/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.4.2">v3.4.2</a> | 4.7.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.2/eclipse4.7.2committers-featureide3.4.2-win64.zip">Windows 64bit</a> (545MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.2/eclipse4.7.2committers-featureide3.4.2-macosx64.zip">MacOS 64bit</a> (545MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.2/eclipse4.7.2committers-featureide3.4.2-linux64.tar.gz">Linux 64bit</a> (541MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.2/eclipse4.7.2platform-featureide3.4.2fm-win64.zip">Windows 64bit</a> (147MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.2/eclipse4.7.2platform-featureide3.4.2fm-macosx64.zip">MacOS 64bit</a> (148MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.2/eclipse4.7.2platform-featureide3.4.2fm-linux64.tar.gz">Linux 64bit</a> (146MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.2/de.ovgu.featureide.lib.fm-v3.4.2.jar">FeatureIDE jar</a> (2MB) and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/07c2a884c11a0c68eb6c283434bb24a318b1e191/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.4.1">v3.4.1</a> | 4.7.1a | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.1/eclipse4.7.1acommitters-featureide3.4.1-win64.zip">Windows 64bit</a> (541MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.1/eclipse4.7.1acommitters-featureide3.4.1-macosx64.zip">MacOS 64bit</a> (542MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.1/eclipse4.7.1acommitters-featureide3.4.1-linux64.tar.gz">Linux 64bit</a> (416MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.1/eclipse4.7.1aplatform-featureide3.4.1fm-win64.zip">Windows 64bit</a> (146MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.1/eclipse4.7.1aplatform-featureide3.4.1fm-macosx64.zip">MacOS 64bit</a> (280MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.1/eclipse4.7.1aplatform-featureide3.4.1fm-linux64.tar.gz">Linux 64bit</a> (218MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.4.1/de.ovgu.featureide.lib.fm-v3.4.1.jar">FeatureIDE jar</a> (2MB) and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/07c2a884c11a0c68eb6c283434bb24a318b1e191/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.3.0">v3.3.0</a> | 4.6.3 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.3.0/eclipse4.6.3committers-featureide3.3.0-win32.zip">Windows 32bit</a> (482MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.3.0/eclipse4.6.3committers-featureide3.3.0-win64.zip">Windows 64bit</a> (482MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.3.0/eclipse4.6.3platform-featureide3.3.0fm-win32.zip">Windows 32bit</a> (143MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.3.0/eclipse4.6.3platform-featureide3.3.0fm-win64.zip">Windows 64bit</a> (143MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.3.0/de.ovgu.featureide.lib.fm-v3.3.0.jar">FeatureIDE jar</a> (1MB) and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/314dd2674618d75ee16c53bfa44bffa312da946d/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.2.0">v3.2.0</a> | 4.6.1 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.2.0/eclipse4.6.1committers-featureide3.2.0-win32.zip">Windows 32bit</a> (487MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.2.0/eclipse4.6.1committers-featureide3.2.0-win64.zip">Windows 64bit</a> (487MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.2.0/eclipse4.6.1platform-featureide3.2.0fm-win32.zip">Windows 32bit</a> (176MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.2.0/eclipse4.6.1platform-featureide3.2.0fm-win64.zip">Windows 64bit</a> (176MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.2.0/de.ovgu.featureide.lib.fm-v3.2.0.jar">FeatureIDE jar</a> (1MB) and <a href="https://github.com/FeatureIDE/FeatureIDE/tree/314dd2674618d75ee16c53bfa44bffa312da946d/plugins/de.ovgu.featureide.fm.core/lib">possibly needed jars</a> |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.1.0">v3.1.0</a> | 4.5.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.1.0/eclipse4.5.2committers-featureide3.1.0-win32.zip">Windows 32bit</a> (643MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.1.0/eclipse4.5.2committers-featureide3.1.0-win64.zip">Windows 64bit</a> (642MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.1.0/eclipse4.5.2platform-featureide3.1.0fm-win32.zip">Windows 32bit</a> (180MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.1.0/eclipse4.5.2platform-featureide3.1.0fm-win64.zip">Windows 64bit</a> (180MB) |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v3.0.0">v3.0.0</a> | 4.5.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.0.0/eclipse4.5.2committers-featureide3.0.0-win32.zip">Windows 32bit</a> (502MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.0.0/eclipse4.5.2committers-featureide3.0.0-win64.zip">Windows 64bit</a> (502MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.0.0/eclipse4.5.2jdt-featureide3.0.0-linux64.tar.gz">Linux 64bit</a> (446MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.0.0/eclipse4.5.2jdk-featureide3.0.0-osx64.tar.gz">Mac 64bit</a> (446MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.0.0/eclipse4.5.2platform-featureide3.0.0fm-win32.zip">Windows 32bit</a> (137MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v3.0.0/eclipse4.5.2platform-featureide3.0.0fm-win64.zip">Windows 64bit</a> (137MB) |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.7.5">v2.7.5</a> | 4.4.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.5/eclipse4.4.2standard-featureide2.7.5-win32.zip">Windows 32bit</a> (550MB) |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.7.4">v2.7.4</a> | 4.4.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.4/eclipse4.4.2standard-featureide2.7.4-win32.zip">Windows 32bit</a> (556MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.4/eclipse4.4.2standard-featureide2.7.4-win64.zip">Windows 64bit</a> (557MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.4/eclipse4.4.2platform-featureide2.7.4fm-win32.zip">Windows 32bit</a> (170MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.4/eclipse4.4.2platform-featureide2.7.4fm-win64.zip">Windows 64bit</a> (170MB) |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.7.3">v2.7.3</a> | 4.4.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.3/eclipse4.4.2standard-featureide2.7.3-win32.zip">Windows 32bit</a> (450MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.3/eclipse4.4.2standard-featureide2.7.3-win64.zip">Windows 64bit</a> (543MB) | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.3/eclipse4.4.2platform-featureide2.7.3fm-win32.zip">Windows 32bit</a> (144MB), <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.3/eclipse4.4.2platform-featureide2.7.3fm-win64.zip">Windows 64bit</a> (144MB) |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.7.2">v2.7.2</a> | 4.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.2/eclipse4.2-featureide2.7.2-win32.zip">Windows 32bit</a> |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.7.1">v2.7.1</a> | 4.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.1/eclipse4.2-featureide2.7.1-win32.zip">Windows 32bit</a> |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.7.0">v2.7.0</a> | 4.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.7.0/eclipse4.2-featureide2.7.0-win32.zip">Windows 32bit</a> |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.6.5">v2.6.5</a> | 4.2 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.6.5/eclipse4.2-featureide2.6.5-win32.zip">Windows 32bit</a> |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.6.4">v2.6.4</a> | 3.6 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.6.4/eclipse3.6-featureide2.6.4-win32.zip">Windows 32bit</a> |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.6.3">v2.6.3</a> | 3.6 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.6.3/eclipse3.6-featureide2.6.3-win32.zip">Windows 32bit</a> |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.6.2">v2.6.2</a> | 3.6 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.6.2/eclipse3.6-featureide2.6.2-win32.zip">Windows 32bit</a> |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.6.1">v2.6.1</a> | 3.6 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.6.1/eclipse3.6-featureide2.6.1-win32.zip">Windows 32bit</a>, <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.6.1/eclipse3.6-featureide2.6.1-linux_i386.tar.bz2">Linux 32bit</a>, and <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.6.1/eclipse3.6-featureide2.6.1-linux_x86_64.tar.bz2">Linux 64bit</a> |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.6.0">v2.6.0</a> | 3.6 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.6.0/eclipse3.6-featureide2.6.0-win32.zip">Windows 32bit</a> |  |  |
| <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.5.1">v2.5.1</a> | 3.6 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.5.1/eclipse3.6-featureide2.5.1-win32.zip">Windows 32bit</a> |  |  |
 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/tag/v2.5.0">v2.5.0</a> | 3.6 | <a href="https://github.com/FeatureIDE/FeatureIDE/releases/download/v2.5.0/eclipse3.6-featureide2.5.0-win32.zip">Windows 32bit</a> |  |  |

<h3>Download with Update Site</h3>

1. Open Eclipse and go to <i>Help &gt; Install New Software...</i> (Eclipse 3.5 and older: <i>Help &gt; Software Updates... &gt; Available Software &gt; Add Site...</i>)
1. Add one of update sites below:
  * FeatureIDE v3.x: <a href="http://featureide.cs.ovgu.de/update/v3/">http://featureide.cs.ovgu.de/update/v3/</a>
  * FeatureIDE v2.6 and v2.7: <a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/deploy/">http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/deploy/</a>
  * FeatureIDE v2.5 and earlier versions: <a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/deploy/2.5/">http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/deploy/2.5/</a>
  * Nightly builds: <a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/nightly/p2-updateSite/">http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/nightly/p2-updateSite/</a> (<em>Hint:</em> disable <i>Group items by category</i> at the update wizard.)
1. Select the features FeatureIDE, Feature Modeling, and the required FeatureIDE extensions. You may need to add further update sites to install FeatureIDE extensions. See table below.
1. Continue with <i>Install...</i>

<h3>Supported Java and Eclipse Versions</h3>

<p><strong>Java 1.7 or higher is required</strong> since FeatureIDE v2.7.3. FeatureIDE 2.7.2 and earlier versions do only require Java 1.6.</p>

<p>If you do not have
<a href="http://www.eclipse.org/downloads/">Eclipse</a> installed, you might
choose the <i>Eclipse IDE for Java Developers</i> in the current version. If you intend to extend Eclipse or FeatureIDE, we recommend <i>Eclipse for Committers</i> instead.<p>

<p>Compatibility of FeatureIDE plug-ins and Eclipse versions. The table contains links to the update sites of additional required plug-ins. As most extensions require <a href="http://www.eclipse.org/jdt/">JDT</a>, it is omitted below.</p>

<table border="0">
<tr>
<th></th>
<th>Feature Modeling</th>
<th>FeatureIDE</th>
<th><a href="https://www.cs.utexas.edu/users/schwartz/ATS.html">AHEAD</a></th>
<th><a href="http://www.infosun.fim.uni-passau.de/spl/apel/fh/">FeatureHouse</a></th>
<th><a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/fcc/">FeatureC++</a></th>
<th><a href="https://eclipse.org/aspectj/">AspectJ</a></th>
<th><a href="http://antenna.sourceforge.net/">Antenna</a></th>
<th><a href="http://sonatype.github.com/munge-maven-plugin/">Munge</a></th>
<th><a href="https://sites.google.com/a/ic.ufal.br/colligens/">Colligens</a> / <a href="https://gcc.gnu.org/onlinedocs/cpp/">CPP</a></th>
<th><a href="http://deltaj.sourceforge.net/">DeltaJ</a></th>
</tr>
 <tr>
<th><a href="https://www.eclipse.org/downloads/packages/release/Oxygen/R">Eclipse 4.8 (Photon)</a></th>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/9.5">CDT 9.5</a></td>
<td bgcolor="#FFCCCC" align ="center"><a href="http://download.eclipse.org/tools/ajdt/48/dev/update">AJDT 4.8 dev builds</a> available, but too buggy</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/9.5">CDT 9.5</a></td>
<td bgcolor="#FFCCCC" align ="center">No</td>
</tr>
 <tr>
<th><a href="https://www.eclipse.org/downloads/packages/release/Oxygen/R">Eclipse 4.7 (Oxygen)</a></th>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/9.3">CDT 9.3</a>, <a href="http://download.eclipse.org/tools/cdt/releases/9.4">CDT 9.4</a></td>
<td bgcolor="#FFFFCC" align ="center">Yes, <a href="http://download.eclipse.org/tools/ajdt/47/dev/update">AJDT 4.7 dev builds</a> seem to work</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/9.3">CDT 9.3</a>, <a href="http://download.eclipse.org/tools/cdt/releases/9.4">CDT 9.4</a></td>
<td bgcolor="#FFCCCC" align ="center">No</td>
</tr>
<tr>
<th><a href="https://www.eclipse.org/downloads/packages/release/Neon/R">Eclipse 4.6 (Neon)</a></th>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/9.1">CDT 9.1</a></td>
<td bgcolor="#FFFFCC" align ="center">Yes, <a href="http://download.eclipse.org/tools/ajdt/46/dev/update">AJDT 4.6 dev builds</a> seem to work</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/9.1">CDT 9.1</a></td>
<td bgcolor="#FFCCCC" align ="center">No</td>
</tr>
<tr>
<th><a href="https://www.eclipse.org/downloads/packages/release/Mars/2">Eclipse 4.5 (Mars)</a></th>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/8.8.1">CDT 8.8.1</a></td>
<td bgcolor="#FFFFCC" align ="center">Yes, <a href="http://download.eclipse.org/tools/ajdt/45/dev/update">AJDT 4.5 dev builds</a> seem to work</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href=" http://download.eclipse.org/tools/cdt/releases/8.8.1">CDT 8.8.1</a></td>
<td bgcolor="#FFCCCC" align ="center">No</td>
</tr>
<tr>
<th><a href="https://www.eclipse.org/downloads/packages/release/Luna/SR2">Eclipse 4.4 (Luna)</a></th>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/8.6">CDT 8.6</a></td>
<td bgcolor="#FFFFCC" align ="center">Yes, <a href="http://download.eclipse.org/tools/ajdt/44/dev/update">AJDT 4.4 dev builds</a> seem to work</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/8.6">CDT 8.6</a></td>
<td bgcolor="#FFCCCC" align ="center">No</td>
</tr>
<tr>
<th><a href="https://www.eclipse.org/downloads/packages/release/Kepler/SR2">Eclipse 4.3 (Kepler)</a></th>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/kepler">CDT</a></td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/ajdt/43/update">AJDT</a></td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/kepler">CDT</a></td>
<td bgcolor="#FFCCCC" align ="center">No</td>
</tr>
<tr>
<th><a href="https://www.eclipse.org/downloads/packages/release/Juno/SR2">Eclipse 4.2 (Juno)</a></th>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/juno">CDT</a></td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/ajdt/42/update">AJDT</a></td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/juno">CDT</a></td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/">Xtext-2.3.1*</a>, <a href="http://xtypes.sourceforge.net/updatesite">XTypeS</a></td>
</tr>
<tr>
<th><a href="https://www.eclipse.org/downloads/packages/release/Indigo/SR2">Eclipse 3.7 (Indigo)</a></th>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/indigo">CDT</a></td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/ajdt/37/update">AJDT</a></td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes</td>
<td bgcolor="#CCFFCC" align ="center">Yes <a href="http://download.eclipse.org/tools/cdt/releases/indigo">CDT</a></td>
<td bgcolor="#CCFFCC">Yes <a href="http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/">Xtext-2.3.1*</a>, <a href="http://xtypes.sourceforge.net/updatesite">XTypeS</a></td>
</tr>
</table>

<p>* Depending on pre-installed plugins, there can be problems with installing Xtext. Check which version of Google Inject you have installed in your plugins folder:
<code>com.google.inject_3.0.0.no_aop.jar</code> works,
<code>com.google.inject_3.0.0.v201203063045.jar</code> does not work.</p>

<p>T-wise generation with CASA is currently only available on Windows systems. If you however need to use it, contact us so we can find a solution.</p>

<p>All functionalities are tested under Windows, Mac, and Linux. However, FeatureIDE is mainly developed under Windows. If you have problems with FeatureIDE on your operating system, please do not hesitate to <a href="mailto:jens.meinicke@ovgu.de,t.thuem@tu-braunschweig.de">contact us</a> or to use our <a href="https://github.com/tthuem/FeatureIDE/issues/new">bug tracker</a>.</p>

<h4>Source Code</h4>
<p>FeatureIDE is released under L-GPL license v3. The source code is available on <a href="https://github.com/tthuem/FeatureIDE">GitHub</a>. See also our <a href="https://github.com/tthuem/FeatureIDE/issues">bug tracker</a> and 
<a href="https://github.com/tthuem/FeatureIDE/wiki">wiki</a>.</p>
<p>When importing the FeatureIDE plug-ins, a) deselect the checkbox for nested projectes, and b) type 'plugins' into the filter. Then you can import the projects you need.</p>

<p>Before switching to Git and GitHub, we used to work with <a href="https://faracvs.cs.uni-magdeburg.de/svn/tthuem-FeatureIDE">SVN</a> (deprecated) and <a href="https://faracvs.cs.uni-magdeburg.de/projects/tthuem-FeatureIDE/">Trac</a> (deprecated). This FeatureIDE website has also been published on other domains, such as <a href="http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/">http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/</a>, <a href="http://featureide.cs.ovgu.de/">http://featureide.cs.ovgu.de/</a>, <a href="http://fosd.de/featureide">http://fosd.de/featureide</a>, <a href="http://fosd.de/fide">http://fosd.de/fide</a>, <a href="http://fosd.net/featureide">http://fosd.net/featureide</a>, <a href="http://fosd.net/fide">http://fosd.net/fide</a>.</p>

<h3>Miscellaneous</h3>

<p>How to install FeatureIDE and retrieve example projects? <a href="slides/featureide-2-getstarted.pdf">FeatureIDE: Get Started</a></p>

<p>Open the FeatureIDE perspective in the right upper corner of the Eclipse window. You also may want to open the FeatureIDE cheat sheet using <i>Help &gt; Cheat Sheets... &gt; FeatureIDE</i>.</p>

<!--<p><strong><em>Our SVN can currently not be accessed using login anonymous (for some reason). We try to fix this asap., but you might want to download the current source code of most plug-ins: <a href="downloads/FeatureIDE-plug-ins-rev2682.zip">FeatureIDE-plug-ins-rev2682.zip</a></em></strong></p>-->

<!--	<h2><a name="usage"></a>Usage</h2>

<p><strong><em>For a current step-by-step tutorial, see the FeatureIDE cheat
sheet in Eclipse (help menu). Examples can be found using "New &gt; Examples &gt;
FeatureIDE".</em></strong></p>

<h4>1. Open the FeatureIDE Perspective</h4>

<p>Open the FeatureIDE Perspective on the right upper corner of Eclipse.</p>

<h4>2. Create a Feature Project</h4>

<p>Use the wizard to create a new Feature Project or convert an existing project
by adding the FeatureIDE nature (right click on the project in package explorer).</p>

<h4>3. Edit the Feature Model</h4>

<p>Open the model.xml file and edit the graphical (Feature Diagram)
or textual version (Source). You can add or delete features using the
context menu and rename using simple click. Features can be moved along
the diagram using drag and drop. Double click on features or
connections will change the feature to optional/mandantory or the
connection type to And/Or/Alternative.</p>

<p>Create new constraints (context menu) or open existing ones (double click)
with the Constraint Editor. You can add features by double clicking on their name, add 
operators using the buttons, or simply with the content assist. The constraint
will be checked towards syntactical (missing brackets) and semantical validity
(causes dead features).</p>

<p>Support for editing is provided by the Feature Model Edit View
which can be opened at <i>Window &gt; Show View &gt; Other...</i>.
This view calculates whether the change you made to the feature model will
cause addition or deletion of products. Additionally, an example
product (added/deleted) is given if it exists.</p>

<h4>4. Create Configuration files</h4>

<p>Use the wizard to create new Configuration files in the folder
<code>configs</code>. In the Advanced Configuration Editor, features can be
selected/deselected by a double click. A
configuration that is not allowed along to the feature model gets an error
marker.</p>

<p>If there is more than one Configuration file, only the one you have
selected using right click and <i>Set as current configuration</i> is built.</p>

<h4>5. Create source files</h4>

<p>Use the wizard to create new FeatureIDE files and add your code.</p>

<p><em>Hint:</em> AHEAD forces that only Java 1.4
constructs are used.</p>

<p><em>Hint:</em> Use of state machines in Jak files is not supported.</p>

<h4>6. Create Run Configurations</h4>

Because FeatureIDE is on top of standard Eclipse projects, you can run the generated program variant as usual, e.g., right click on a generated Java file and use <i>Run As...</i>.
-->			
<h2><a name="faq"></a>FAQ</h2>

<h3>Why are the symbols in cross-tree constraints below the feature diagram are not displayed correctly?</h3>
Please make sure that the font <i>Arial Unicode MS</i> is installed on your operating system so that FeatureIDE can use it to display the cross-tree constraints.

<h3>How can I use external jar files in my FeatureIDE project?</h3>
For FeatureIDE 2.4 and older: Please create a folder named <code>lib</code> at the project root and insert all jar files which you intent to reference. The jar files are detected by the compiler and added as parameters if you run your FeatureIDE application.
<br/>
For FeatureIDE 2.5 and newer: Right click the jar files in package explorer and add them to the Java build path.

<h3>How can I compare two different feature models in FeatureIDE?</h3>
<ol>
<li>Prepare two FeatureIDE projects (A and B) that contain the feature models you want to compare. Either edit them using FeatureIDE or import them from other formats, e.g., GUIDSL.</li>
<li>Open the feature model of project A, switch to the tab <i>Source</i>, and copy the whole document.</li>
<li>Open the feature model of project B, switch to the tab <i>Source</i>, and paste the clipboard.</li>
<li>Switch back to the tab Feature Diagram in editor of project B and the feature model edit view will show the results.</li>
</ol>
Checkout this <a href="https://youtu.be/j_MfFVeb8J0">video</a> to see how to do it.

<h3>How can I import/export the feature model from/to other tools?</h3>
Select the file model.xml in Package Explorer and open the context menu, then choose <i>FeatureIDE &gt; Import/Export ...</i>

<h3>How can I store my feature model to a bitmap graphic or PDF file?</h3>
Select or open your feature model and then choose <i>File &gt; Save As</i> or <i>File &gt; Print</i>. The latter option requires that you have a PDF printer installed and have a program to crop PDFs (such as Adobe Acrobat).
<br/>
Note, that you can change the layout of the feature model since FeatureIDE 2.6 using <i>Set Layout</i> in the context menu of the feature model editor. There are pre-defined layouts, but you can also manually move features for compact positioning.

<h2><a name="contact"></a>Contact</h2>

<p>For more information about the project, support requests, and technical questions, do not hesitate to
contact the <a href="mailto:t.thuem@tu-braunschweig.de,sebastian.krieter@ovgu.de,jens.meinicke@ovgu.de">FeatureIDE development team</a>. For bug reports, you can use our <a href="https://github.com/FeatureIDE/FeatureIDE/issues/new">bug tracker</a>.</p>

<p>FeatureIDE development team:</p>

<ul>
<li><a href="https://www.tu-braunschweig.de/isf/team/thuem">Thomas Th&uuml;m</a> (TU Braunschweig, Germany)</li>
<li><a href="http://wwwiti.cs.uni-magdeburg.de/~krieter/">Sebastian Krieter</a> (University of Magdeburg, Germany)</li>
<li><a href="https://wwwiti.cs.uni-magdeburg.de/~meinicke">Jens Meinicke</a> (Carnegie Mellon University, USA; University of Magdeburg, Germany)</li>
<li>Joshua Sprey (TU Braunschweig, Germany)</li>
<li>Paul Westphal (TU Braunschweig, Germany)</li>
<li>Chico Sundermann (TU Braunschweig, Germany)</li>
<li>Christian Orsinger (TU Braunschweig, Germany)</li>
<li><a href="https://www.hs-harz.de/tleich/">Thomas Leich</a> (Metop Research Institute, Germany; Harz University of Applied Sciences, Germany)</li>
<li><a href="http://wwwiti.cs.uni-magdeburg.de/~saake/">Gunter Saake</a> (University of Magdeburg, Germany)</li>
<li><a href="https://www.tu-braunschweig.de/isf/team/schaefer/index.html">Ina Schaefer</a> (TU Braunschweig, Germany)</li>
<li><a href="https://www.cs.cmu.edu/~ckaestne/">Christian K&auml;stner</a> (Carnegie Mellon University, USA)</li>
<li><a href="https://www.infosun.fim.uni-passau.de/cl/staff/apel/">Sven Apel</a> (University of Passau, Germany)</li>
</ul>

<p>Further contributors and former project members:</p>

<ul>
<li>Ajeeth Kularajan (TU Braunschweig, Germany)</li>
<li>Alexander Dreiling (University of Magdeburg, Germany)</li>
<li>Alexander Kn&uuml;ppel (TU Braunschweig, Germany)</li>
<li>Alexander Schmidt (University of Magdeburg, Germany)</li>
<li><a href="http://cs.unibg.it/gargantini/">Angelo Gargantini</a> (University of Bergamo, Italy)</li>
<li>Anna-Liisa Ahola (TU Braunschweig, Germany)</li>
<li>Antje Mönch (TU Braunschweig, Germany)</li>
<li>Christian Becker (University of Magdeburg, Germany)</li>
<li>Christian Lausberger (University of Magdeburg, Germany)</li>
<li>Christoph Giesel (University of Magdeburg, Germany)</li>
<li>Christopher Kruczek (Metop Research Institute, Magdeburg, Germany)</li>
<li>Christopher Sontag (TU Braunschweig, Germany)</li>
<li>Constanze Adler (University of Magdeburg, Germany)</li>
<li>Cyrill Meier (University of Magdeburg, Germany)</li>
<li>Daniel Hohmann (University of Magdeburg, Germany)</li>
<li>Dariusz Krolikowski (University of Magdeburg, Germany)</li>
<li>David Broneske (University of Magdeburg, Germany)</li>
<li>David Halm (University of Magdeburg, Germany)</li>
<li>Dawid Szczepanski  (TU Braunschweig, Germany)</li>
<li>Domenik Eichhorn (TU Braunschweig, Germany)</li>
<li>Dominik Hamann (University of Magdeburg, Germany)</li>
<li><a href="https://www.cs.utexas.edu/~dsb/">Don Batory</a> (University of Texas at Austin, USA)</li>
<li>Edgard Schmidt (TU Braunschweig, Germany)</li>
<li>Edward Bechthold (TU Braunschweig, Germany)</li>
<li>Enis Belli (TU Braunschweig, Germany)</li>
<li>Eric Schubert (University of Magdeburg, Germany)</li>
<li>Erik D&auml;nike (University of Magdeburg, Germany)</li>
<li><a href="https://wwwiti.cs.uni-magdeburg.de/~benduhn/">Fabian Benduhn</a> (University of Magdeburg, Germany)</li>
<li>Fabian Wielgorz (University of Passau, Germany)</li>
<li>Felix Rieger (University of Marburg, Germany)</li>
<li>Fl&aacute;vio Medeiros (Federal University of Alagoas, Brazil)</li>
<li>Florian Proksch (University of Magdeburg, Germany)</li>
<li>Francisco Dalton (Federal University of Alagoas, Brazil)</li>
<li>Hannes Smuracsky (University of Magdeburg, Germany)</li>
<li>Holger Fenske (TU Braunschweig, Germany)</li>
<li>Indika Weerasingha Kumara (Swinburne University of Technology, Melbourne, Australia)</li>
<li>Ingo Siemers (University of Magdeburg, Germany)</li>
<li>Insansa Mun Gomba Michel (TU Braunschweig, Germany)</li>
<li>Jan Wedding (University of Magdeburg, Germany)</li>
<li>Jan Werner (TU Braunschweig, Germany)</li>
<li>Janet Siegmund (Feigenspan) (Metop Research Institute, Magdeburg, Germany)</li>
<li>Jann-Ole Henningson (TU Braunschweig, Germany)</li>
<li>J&ouml;rg Liebig (University of Passau, Germany)</li>
<li>Kai Wolf (University of Magdeburg, Germany)</li>
<li>Kamil Rosiak (TU Braunschweig, Germany)</li>
<li>Konstantin Tonscheidt (University of Magdeburg, Germany)</li>
<li>Laura Marnitz (University of Magdeburg, Germany)</li>
<li>Lennart Kontny (TU Braunschweig, Germany)</li>
<li>Maik Lampe (University of Magdeburg, Germany)</li>
<li>Malek Badeer (TU Braunschweig, Germany)</li>
<li><a href="https://www.ict.swin.edu.au/personal/mkapuruge/">Malinda Kaushalye Kapuruge</a> (Swinburne University of Technology, Melbourne, Australia)</li>
<li>Marcel Daniel (TU Braunschweig, Germany)</li>
<li><a href="http://www.ic.ufal.br/marcio">M&aacute;rcio Ribeiro</a> (Federal University of Alagoas, Brazil)</li>
<li>Marcus Kamieth (University of Magdeburg, Germany)</li>
<li>Marcus Leich (University of Magdeburg, Germany)</li>
<li>Marcus Pinnecke (University of Magdeburg, Germany)</li>
<li>Marlen Bernier  (TU Braunschweig, Germany)</li>
<li>Matthias Quaas (University of Magdeburg, Germany)</li>
<li>Maximilian Homann (TU Braunschweig, Germany)</li>
<li>Melanie Pflaume (University of Magdeburg, Germany)</li>
<li>Mohammed Mahhouk (TU Braunschweig, Germany)</li>
<li>Niklas Lehnfeld (TU Braunschweig, Germany)</li>
<li>Oliver Urbaniak (TU Braunschweig, Germany)</li>
<li>Paolo Vavassori (University of Bergamo, Italy)</li>
<li>Paul Maximilian Bittner (TU Braunschweig, Germany)</li>
<li>Patrick Sulkowski (University of Magdeburg, Germany)</li>
<li>Patrick Venohr (University of Magdeburg, Germany)</li>
<li>Patrik Haese (University of Magdeburg, Germany)</li>
<li>Philipp Kuhn (TU Braunschweig, Germany)</li>
<li>Rahel Arens (TU Braunschweig, Germany)</li>
<li><a href="https://wwwiti.cs.uni-magdeburg.de/~rschroet/">Reimar Schr&ouml;ter</a> (University of Magdeburg, Germany)</li>
<li>Sabrina Hugo (TU Braunschweig, Germany)</li>
<li><a href="https://www.tu-braunschweig.de/isf/team/schulze">Sandro Schulze</a> (University of Magdeburg, Germany)</li>
<li>Sofia Ananieva (TU Braunschweig, Germany)</li>
<li>S&ouml;nke Holthusen (University of Magdeburg, Germany)</li>
<li>Sebastian Henneberg (University of Passau, Germany)</li>
<li>Stefan Kr&uuml;ger (University of Paderborn, Germany)</li>
<li>Stefanie Bolle (TU Braunschweig, Germany)</li>
<li>Stefanie Schober (TU Braunschweig, Germany)</li>
<li>Steffen Schulze (University of Magdeburg, Germany)</li>
<li>Stephan Besecke (University of Magdeburg, Germany)</li>
<li>Stephan Kauschka (University of Magdeburg, Germany)</li>
<li>Sven Schuster (University of Braunschweig, Germany)</li>
<li>Thiago Emmanuel de Oliveira Lima (Federal University of Alagoas, Brazil)</li>
<li>Thomas Graave (TU Braunschweig, Germany)</li>
<li>Tim Lautenschl&auml;ger (University of Magdeburg, Germany)</li>
<li>Timo G&uuml;nther (TU Braunschweig, Germany)</li>
<li>Tobias Pett (TU Braunschweig, Germany)</li>
<li>Tom Brosch (University of Magdeburg, Germany)</li>
<li>Torsten St&ouml;ter (University of Magdeburg, Germany)</li>
</ul>

<h2><a name="statistics"></a>Statistics</h2>

<p>Since 2007 FeatureIDE is being used by lecturers at numerous universities:</p>

<ul>
<li><a href="http://www.dbse.ovgu.de/dbse/en/Lectures.html">University of Magdeburg, Germany</a> (Christian K&auml;stner, Gunter Saake, Martin Kuhlemann, Norbert Siegmund, Thomas Th&uuml;m, Thomas Leich)</li>
<li><a href="http://www.infosun.fim.uni-passau.de/se/teaching.php">University of Passau, Germany</a> (Sven Apel, Norbert Siegmund)</li>
<li><a href="https://www.uni-marburg.de/fb12/arbeitsgruppen/swt/lehre">University of Marburg, Germany</a> (Christian K&auml;stner, Daniel Str&uuml;ber, Gabriele Taentzer)</li>
<li><a href="https://www.tu-braunschweig.de/isf/teaching">TU Braunschweig, Germany</a> (Sandro Schulze, Thomas Th&uuml;m)</li>
<li><a href="http://www.es.tu-darmstadt.de/lehre/aktuelle-veranstaltungen/">TU Darmstadt, Germany</a> (Malte Lochau)</li>
<li><a href="http://www.isse.jku.at/">JKU Linz, Austria</a> (<a href="http://mevss.jku.at/?page_id=57">Rick Rabiser</a>)</li>
<li><a href="https://www.cs.cmu.edu/~ckaestne/teaching.html">Carnegie Mellon University, USA</a> (Christian K&auml;stner)</li>
<li><a href="https://www.hs-harz.de/tleich/lehre/">Hochschule Harz, Germany</a> (Thomas Leich)</li>
<li><a href="https://www.uni-koblenz-landau.de/en/campus-koblenz/fb4/ist/rgse/teaching">University of Koblenz-Landau, Germany</a> (Daniel Str&uuml;ber, Jan Jürjens)</li>
<li><a href="http://www.fil.univ-lille1.fr/portail/index.php?dipl=MInfo&sem=IAGL&ue=IFI&label=Pr%C3%A9sentation">University of Lille, France</a> (Clément Quinton)</li>
<li>Is your lecture missing? Please <a href="mailto:jens.meinicke@ovgu.de,t.thuem@tu-braunschweig.de">let us know</a>.</li>
</ul>

<p>Since December 2010 FeatureIDE is listed at the <a href="http://marketplace.eclipse.org/content/featureide">Eclipse Marketplace</a>.</p>

<!--<img src="http://chart.googleapis.com/chart?chd=t%3A18.072289156627%2C19.277108433735%2C39.759036144578%2C33.734939759036%2C34.939759036145%2C25.301204819277%2C27.710843373494%2C33.734939759036%2C39.759036144578%2C100%2C68.674698795181%2C2.4096385542169&cht=bvg&chs=420x240&chtt=Marketplace%20Client%20Install&chts=000000%2C22&chl=1/12%7C2/12%7C3/12%7C4/12%7C5/12%7C6/12%7C7/12%7C8/12%7C9/12%7C10/12%7C11/12%7C12/12&chco=ff6c0a&chf=&chxr=0%2C0%2C83&chxl=1%3A%7C%20%7CInstalls%7C%20&chxt=r%2Cr&chxp=&chxs=1%2C000000%2C12&chbh=20%2C10"/></a>
-->

<p>Since 2007 we received support request from the following cities:</p>

<iframe width="100%" height="500" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.de/maps/ms?hl=de&amp;ie=UTF8&amp;msa=0&amp;msid=102992651395946830408.00048f64a422726e89385&amp;ll=3.385828,-53.202496&amp;spn=90,137.655601&amp;t=h&amp;output=embed"></iframe>
<br/>
<small>View <a href="https://maps.google.de/maps/ms?hl=de&amp;ie=UTF8&amp;msa=0&amp;msid=102992651395946830408.00048f64a422726e89385&amp;ll=3.385828,-53.202496&amp;spn=90,137.655601&amp;t=h&amp;source=embed" style="color:#0000FF;text-align:left">FeatureIDE Support Requests</a> on a larger map</small>

<!--<h2><a name="relateddownloads"></a>Related Downloads</h2>
<p>We generated 2000 feature models for our current research
which are available for download. There are 200 models in ten different
sizes: <a href="fms/10.zip">10</a>, <a href="fms/20.zip">20</a>, <a href="fms/50.zip">50</a>,
<a href="fms/100.zip">100</a>, <a href="fms/200.zip">200</a>, <a href="fms/500.zip">500</a>,
<a href="fms/1000.zip">1000</a>, <a href="fms/2000.zip">2000</a>, <a href="fms/5000.zip">5000</a> and <a href="fms/10000.zip">10000</a> features. All feature
models contain cross-tree constaints growing with the number of
features and are not void, i.e., they contain at least one product.</p>
<p>Guidsl jar file: <a href="guidsl.jar">guidsl.jar</a></p>-->

<!-- BEGIN: Powered by Supercounters.com -->
<center>
<script type="text/javascript" src="http://widget.supercounters.com/hit.js"></script>
<script type="text/javascript">sc_hit(782093,0,5);</script>
<br><noscript><a href="http://www.supercounters.com">Tumblr Hit Counter</a></noscript>
</center>
<!-- END: Powered by Supercounters.com -->

<p align="center">
Sponsored by <br/>
<a href="http://www.metop.de/"><img style="border: 0px solid; width: 80px; height: 80px;" alt="Metop Research Institute" src="logo/metop_logo.png" /></a>
</p>