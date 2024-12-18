# BiofeeDPET

Biofeedback system using wearables as smart watches and mobile devices aimed to support individuals with Parkinson's Disease (PD) and Essential Tremor (ET) conditions.


### UPDATE 2024-10-07

Hello all,

This project has started as a lab activity within Advanced Software Engineering Techniques (ASET) at Computer Science Faculty - “Alexandru Ioan Cuza” University – Iasi, Romania, and includes an open invite to other master students and for scholars involved in research doctorates in this domain or related fields.

This repo is intended to support and extend the efforts that have been made in this area of study in order to bring the newest technologies to those who want to help themselves related to a specific condition.



## Table of contents

### State-of-the-art

A: [Contribution](/saa-iulian.md) of Iulian Gherghevici

B: [Contribution](/ssa-cristian.md) of Cristian Pop-Razbuc

C: [Contribution](/ssa-tatiana.md) of Tatiana Gulica


***BiofeeDPET*** app supports and extends:

1969 - _An instrument for producing deep muscle relaxation by means of analog information feedback_ by Thomas H. Budzynski, Johann M. Stoyva. 
       doi: 10.1901/jaba.1969.2-231  [https://www.ncbi.nlm.nih.gov/pmc/articles/PMC1311072/](url)

1981 - _Inteligenta materiei_ by Dumitru Constantin. 2021 Aniversary edition  [https://dulcan.ro/carti/serie-de-autor/inteligenta-materiei](url) ISBN/ISSN: 978-606-797-161-3

1984 - _Between Health and Illness: New Notions on Stress and the Nature of Well Being_ by Barbara B. Brown. New York: Houghton Mifflin. ISBN 9780395346341.

...

2004 - _Evidence-based practice in biofeedback and neurofeedback_ by Yucha C, Gilbert C. The Association for Applied Psychophysiology and Biofeedback. Wheat Ridge, CO.

2017 - Sound therapy by Regina Murphy. [https://www.soundtherapysolutions.com/](url)

2018 - _Combined accelerometer and genetic analysis to differentiate essential tremor from Parkinson’s disease_ by Ali Torkamani et al.
       doi: [https://doi.org/10.7717/peerj.5308](url)  [https://peerj.com/articles/5308/](url)

2020 - Wearable Solutions for Patients with Parkinson’s Disease and Neurocognitive Disorder: A Systematic Review by Asma Channa, Nirvana Popescu and Vlad Ciobanu
       doi: 10.3390/s20092713  [https://pubmed.ncbi.nlm.nih.gov/32397516/](url)

2022 - Parkinsons Disease Management via Wearable Sensors: A Systematic Review by Huma Mughal et al.
       doi:  10.1109/ACCESS.2022.3162844  [https://ieeexplore.ieee.org/document/9743908](url)

2023 - _Overview on wearable sensors for the management of Parkinson’s disease_ by Caroline Moreau. 
       doi: [https://doi.org/10.1038/s41531-023-00585-y](url) [https://www.nature.com/articles/s41531-023-00585-y](url)

2023 - _Deep learning and wearable sensors for the diagnosis and monitoring of Parkinson’s disease: A systematic review_ by Luis Sigcha.
       doi: [https://doi.org/10.1016/j.eswa.2023.120541](url)  [https://www.sciencedirect.com/science/article/pii/S0957417423010436?via%3Dihub](url)



### Architecture

### Constructs

### Project structure

### Deployment
The application containerized with Docker will be deployed on a Kubernetes cluster with Jenkins plugin on Google Cloud Platform.

### Collection of metrics
All four main types of mobile app trackable metrics will be used for assessment:
- User engagement
- Consumer satisfaction
- Acquisition
- Performance
The metrics included in the above categories will be managed through Prometheus and Google Cloud Managed Service, and will be presented on a Grafana dashboard.

### Known issues
The functionality of the app depends on sensors reading accuracy and correct wearing the wrist watch.

### Additional resources
Other projects use low currents levels to control and adjust muscle contractions, up to 58 contact points so far in special suits.

### Quickstart:


### Project links:


### Library reference:


### Examples:


### Installing:


### Requirements:

To use all of the functionality of this app, you should have:

The following requirements are optional, but can improve or extend functionality in some situations:

### Troubleshooting:

### Developing:
To work on this project, first make sure you have all the requirements listed.
Before a release, the version number is bumped in README.rst.
Version tags are then created using

`git config gpg.program gpg2 && git config user.signingkey xxxxxxxxxx && git tag -s VERSION_GOES_HERE -m "Version VERSION_NO"`.

Releases are done by running `make-release.sh VERSION_NO` to build the source packages, sign them, and upload them.

### Testing:
To run all the tests:

To run static analysis:

Testing is also done automatically by GitHub Actions, upon every push.

### Authors:
Iulian Gherghevici: Gyulius <giulianbqc@gmail.com>

Cristian Pop-Razbuc: Cristi4066 <poprazbuccristian@gmail.com>

Tatiana Gulica: Tatiana127 <gulicatatiana97@gmail.com>

Team management will be handled through a JIRA project:

Link: [https://iul-ge.atlassian.net/jira/software/projects/BIOF/boards/1](url)

### Coordinator
Professor, PhD. _Adrian Iftene_

Faculty of Computer Science

_Alexandru Ioan Cuza_ University

Iasi, Romania
<adiftene@gmail.com>



